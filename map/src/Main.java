import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
//        AgendaContatos agendaContatos = new AgendaContatos();
//        agendaContatos.adicionarContato("Camila", 123456);
//        agendaContatos.adicionarContato("Camila", 789012);
//        agendaContatos.adicionarContato("Camila Cavalcante", 123456);
//        agendaContatos.adicionarContato("Camila DIO", 345678);
//        agendaContatos.adicionarContato("Maria Silva", 123456);
//        agendaContatos.adicionarContato("Camila", 901234);
//
//        agendaContatos.exibirContatos();
//
//        agendaContatos.removerContato("Maria Silva");
//        agendaContatos.exibirContatos();
//
//        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
//        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
//        estoqueProdutos.exibirProdutos();
//
//        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
//        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
//        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15.0);
//        estoqueProdutos.adicionarProduto(4L, "Produto D", 14, 20.0);
//
//        estoqueProdutos.exibirProdutos();
//
//        System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
//        System.out.println("Produto mais caro: R$ " + estoqueProdutos.obterProdutoMaisCaro());

        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 10), "Evento 2", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 21), "Evento 3", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 29), "Evento 4", "Atração 8");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();


    }
}