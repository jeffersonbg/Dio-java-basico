public class Main {
    public static void main(String[] args) {
//        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
//        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
//
//        conjuntoConvidados.adicionarConvidado("Convidado 1º", 123);
//        conjuntoConvidados.adicionarConvidado("Convidado 2º", 123);
//        conjuntoConvidados.adicionarConvidado("Convidado 3º", 789);
//        conjuntoConvidados.adicionarConvidado("Convidado 4º", 112);
//
//        conjuntoConvidados.exibirConvidados();
//
//        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
//
//        conjuntoConvidados.removerConvidadoPorCodigoConvite(789);
//        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
//
//        conjuntoConvidados.exibirConvidados();

//        AgendaContatos agendaContatos = new AgendaContatos();
//
//        agendaContatos.exibirContatos();
//
//        agendaContatos.adicionarContato("Camila", 123456);
//        agendaContatos.adicionarContato("Camila", 0);
//        agendaContatos.adicionarContato("Camila Cavalante", 1111111111);
//        agendaContatos.adicionarContato("Camila DIO", 65789875);
//        agendaContatos.adicionarContato("Maria silva", 1111111111);
//
//        agendaContatos.exibirContatos();
//
//        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
//
//        System.out.println("Contato atualizado "+ agendaContatos.atualizarNumeroContato("Maria silva", 2693262));
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(123L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(456L, "Produto 5", 20d, 10);
        cadastroProdutos.adicionarProduto(123L, "Produto 5", 10d, 2);
        cadastroProdutos.adicionarProduto(789L, "Produto 5", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println();
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println();
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}