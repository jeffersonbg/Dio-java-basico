import java.lang.String;

public class Main {
    public static void main(String[] args) {
//        ListaTarefa lista = new ListaTarefa();
//        System.out.println("O numero total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
//
//        lista.adicionarTarefa("Tarefa 1");
//        System.out.println("O numero total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
//
//        lista.adicionarTarefa("Tarefa 1");
//        lista.adicionarTarefa("Tarefa 2");
//        System.out.println("O numero total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
//
//        lista.removerTarefa("Tarefa 2");
//        System.out.println("O numero total de elementos na lista é: " + lista.obterNumeroTotalTarefas());
//
//        lista.obterDescricoesTarefas();

//        CatalogoLivros catalogoLivros = new CatalogoLivros();
//        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
//        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
//        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
//        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
//        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2024);
//
//        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
//        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("nome 2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("nome 3", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("nome 4", 17, 1.56);
        ordenacaoPessoas.adicionarPessoa("nome 5", 32, 1.64);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
