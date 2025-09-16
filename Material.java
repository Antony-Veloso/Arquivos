public class Material {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private boolean disponivel;

    public Material(String titulo, String autor, int ano_publicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
        this.disponivel = true;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void emprestar() throws MaterialIndisponivelError {
        if(disponivel==false){
            throw new MaterialIndisponivelError("Material indisponível");
        }
        else{
            disponivel = false;
            System.out.println("Material emprestado: " + this.titulo);
        }
    }

    public void devolver() {
        if(disponivel==true){
            System.out.println("Material já devolvido");
        }
        else{
            disponivel=true;
            System.out.println("Material devolvido: " + this.titulo);
        }
    }

    public String exibir_info(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nTitulo: " + this.titulo);
        sb.append("\nAutor: " + this.autor);
        sb.append("\nAno: " + this.ano_publicacao);
        sb.append("\nSituação: " + (disponivel ? "disponível" : "indisponvível"));
        return sb.toString();
    }
}
