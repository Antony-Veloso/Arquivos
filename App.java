public class App {
        public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criar materiais
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia");
        Revista revista1 = new Revista("National Geographic", "Vários", 2021, "Edição 120");

        // Adicionar materiais
        biblioteca.adicionarMaterial(livro1);
        biblioteca.adicionarMaterial(revista1);

        // Criar usuário
        Usuario usuario1 = new Usuario("Alice", "2023001");

        try {
            // Emprestar livro disponível
            biblioteca.emprestar("O Senhor dos Anéis", usuario1);

            // Tentar emprestar o mesmo livro de novo
            biblioteca.emprestar("O Senhor dos Anéis", usuario1);

        } catch (MaterialIndisponivelError e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (MaterialNaoEncontradoError e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            // Devolver livro
            biblioteca.devolver("O Senhor dos Anéis", usuario1);

            // Tentar emprestar material inexistente
            biblioteca.emprestar("Harry Potter", usuario1);

        } catch (MaterialNaoEncontradoError e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (MaterialIndisponivelError e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Mostrar estado final
        biblioteca.exibirMateriais();
    }
}
