import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos
        /*
         * = | Atribuição
         * == | Igual
         * != | Diferente
         * < | Menor
         * > | Maior
         * <= | Menor igual
         * >= | Maior igual
         */

        // ATRIBUIÇÃO
        String nome = "JEFFERSON";
        int idade = 25;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Doador?: " + doadorOrgao);
        System.out.println("Data Nascimento: " + dataNascimento);

        System.out.println();
        // ARITMETICOS
        double soma = 10.5 + 15.5;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        double multiplicacaoDois = 20 * 7.5;
        int divisao = 15 / 3;
        int divisaoDois = 15 / 4;
        double divisaoTres = (float) 15 / 7;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Multiplicação 2: " + multiplicacaoDois);
        System.out.println("Divisão: " + divisao);
        System.out.println("Divisão 2: " + divisaoDois);
        System.out.println("Divisão 3: " + divisaoTres);
        System.out.println("Modulo: " + modulo);
        System.out.println("Resultado: " + resultado);

        System.out.println();
        // CONCATENAÇÃO
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println("Primeira concatenação: " + concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println("Segunda concatenação: " + concatenacao);

        System.out.println();
        // OPERADORES UNARIOS
        /*
         * (+) Operador unario de valor positivo.
         * (-) Operador unario de valor negativo.
         * (++) Operador unario de incremento de valor
         * (--) Operador unario de decremento de valor
         * (!) Operador unario de negação
         */

        // EXEMPLO
        int numeroInteiro = 5;
        numeroInteiro = -numeroInteiro;
        System.out.println(numeroInteiro);

        numeroInteiro = numeroInteiro * -1;
        System.out.println(numeroInteiro);

        System.out.println();
        // REPETIÇÃO
        int numero = 5;
        numero = numero + 2;
        System.out.println(numero);
        numero++;
        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(numero--);
        System.out.println(numero);
        System.out.println(--numero);

        boolean variavel = true;
        System.out.println(!variavel); // Negação lógica
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        // OPERADOR TERNARIO
        /*
         * <Expressão Condicional> ? <Caso condição seja true>:<Caso condição seja
         * false>
         */

        // EXEMPLO
        int a, b;
        a = 30;
        b = 40;

        /*
         * if (a == b)
         * resultadoLogico = "verdadeiro";
         * else
         * resultadoLogico = "falso";
         */
        String resultadoLogico = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultadoLogico);

        System.out.println();
        // OPERADORES RELACIONAIS
        /*
         * == | IGUAL
         * != | DIFERENTE
         * > | MAIOR QUE
         * < | MENOR QUE
         * >= | MAIOR OU IGUAL
         * <= | MENOR OU IGUAL
         */

        // EXEMPLO
        int numeroUm = 1;
        int numeroDois = 2;

        boolean simNao = numeroUm == numeroDois;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numeroUm != numeroDois;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numeroUm > numeroDois;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numeroUm < numeroDois;
        System.out.println("numeroUm é menor que numeroDois? " + simNao);

        simNao = numeroUm >= numeroDois;
        System.out.println("numeroUm é maior ou igual a numeroDois? " + simNao);

        simNao = numeroUm <= numeroDois;
        System.out.println("numeroUm é menor ou igual a numeroDois? " + simNao);

        System.out.println();
        String nomeUm = "Jefferson";
        String nomeDois = new String("Jefferson");
        System.out.println("nomeUm é igual a nomeDois? " + (nomeUm == nomeDois));
        System.out.println("nomeUm é igual a nomeDois? " + nomeUm.equals(nomeDois)); // Compara conteudos.

        System.out.println();
        // OPERADORES LOGICOS
        /*
         * && | Operador logico "E"
         * || | Operador logico "OU"
         */

        // EXEMPLO
        boolean condicaoUm = true, condicaoDois = false;

        System.out.println("As duas condições são: " + (condicaoUm && condicaoDois));
        System.out.println("As duas condições são: " + (condicaoUm || condicaoDois));

    }
}
