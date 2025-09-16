public class Livro extends ItemBiblioteca implements IEmprestavel {
    
    private String genero;

    public Livro(String titulo, String autor, int ano_publicacao, String genero){
        super(titulo,autor,ano_publicacao);
        this.genero = genero;
    }

    @Override
    public double calcular_multa(int diasAtraso){
        return 0.5*diasAtraso;
    }

    @Override
    public void emprestarItem() throws MaterialIndisponivelError {
        emprestar();
    }

    @Override
    public void devolverItem(){
        devolver();
    }
}
