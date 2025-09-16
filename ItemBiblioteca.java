public abstract class ItemBiblioteca extends Material{
    public ItemBiblioteca(String titulo, String autor, int ano_publicacao){
        super(titulo, autor, ano_publicacao);
    }

    public abstract double calcular_multa(int diasAtraso);
}
