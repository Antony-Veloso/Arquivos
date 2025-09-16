public class Revista extends ItemBiblioteca implements IEmprestavel{
    private String edicao;

    public Revista(String titulo, String autor, int ano_publicacao, String edicao){
        super(titulo, autor, ano_publicacao);
        this.edicao = edicao;
    }

    @Override
    public double calcular_multa(int diasAtraso){
        return 0.25*diasAtraso;
    }

    @Override
    public void emprestarItem() throws MaterialIndisponivelError{
        emprestar();
    }

    @Override
    public void devolverItem(){
        devolver();
    }
}