public class TiposVariaveis {
    public static void main(String[] args) {
        System.out.println("Tipos e Variaveis");

        /*  Os oito tipos primitivos em Java são:
         *  int, byte, short, long, float, double, boolean e char.
        */

        /*  Declaração de Variáveis
         *  <Tipo> <nomeVariavel>  = <AtribuicaoDeValorOpcional>;
         */

        //Exemplos
        String meuNome = "Jefferson Bezerra";   //String é um tipo de dado do Java que representa uma sequência de caracteres.
        int minhaIdade = 32;
        int anoFabricação = 2021;
        double salarioMinimo = 2500.33;

        byte idade = 123;
        short ano = 2021;
        int cep = 59990000; // se começar com zero use string
        long cpf = 98765432109L; // se começar com zero use string
        float pi = 3.14F;
        double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // Constante em java
       
    }
}
