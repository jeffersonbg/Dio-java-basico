public class MinhaClasse {

    public static void main(String[] args) {
        /* int ano = 2021;
        ano = 2024;
        
        final String BR = "Brasil";
        
        double PI = 3.14;

        int ESTADOS_BRASILEIRO = 27;
        int ANO_2000 = 2000;

        //Declarando variaveis
        /* Tipo NomeBemDefinido = Atribuição
        //Exemplo:

        int idade = 32;
        String meuNome = "Jefferson Bezerra";
        int anoFabricação = 1991;
        boolean verdadeira = false;

        anoFabricação = 2018;

        String primeiroNome = "Jefferson";
        String segundoNome = "Bezerra";
        String nome = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nome); */

        int mediaFinal = 5;
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
        
    }

    //Declarando metodos
        /* TipoRetorno NomeObjetivoNoInfinitivo(Parametros)*/
        //Exemplo:

    public static int somar( int numeroUm, int numero2){
        return numeroUm + numero2;
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        //return  primeiroNome.concat(" ").concat(segundoNome);
        return ""+primeiroNome+" "+segundoNome;
    }
}