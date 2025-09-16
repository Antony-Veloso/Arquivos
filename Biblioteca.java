import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    private List <ItemBiblioteca> materiais;

    public Biblioteca(){
        materiais = new ArrayList<>();
    }

    public void adicionarMaterial(ItemBiblioteca material) {
        if(material==null){
            System.out.println("Material nulo");
        }else{
        materiais.add(material);
        }
    }

    public ItemBiblioteca procurarMaterial(String titulo) {
        for(ItemBiblioteca i : materiais){
            if(titulo.equalsIgnoreCase(i.getTitulo())){
                return i;
            }
        }
        return null;
    }

    public void emprestar(String titulo, Usuario user) throws MaterialNaoEncontradoError, MaterialIndisponivelError {
        ItemBiblioteca n = procurarMaterial(titulo);
        if(n==null){
            throw new MaterialNaoEncontradoError("Material não encontrado");
        }
        else{
            n.emprestar();
        }
    }

    public void devolver(String titulo, Usuario user) throws MaterialNaoEncontradoError {
        ItemBiblioteca n = procurarMaterial(titulo);
        if(n==null){
            throw new MaterialNaoEncontradoError("Material não encontrado");
        }
        else{
            n.devolver();
        }
    }

    
    public void exibirMateriais() {
        System.out.println("\n📚 Estado final dos materiais:");
        for (ItemBiblioteca m : materiais) {
            System.out.println(m.exibir_info());
        }
    }
}
