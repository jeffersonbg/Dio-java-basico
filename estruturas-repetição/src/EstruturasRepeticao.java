import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EstruturasRepeticao {
    public static void main(String[] args) throws Exception {
        System.out.println("Estruturas de Repetição");

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando Carneirinho " + carneirinhos);
        }

        System.out.println("Joaozinho dormiu");

        String alunos[] = { "Felipe", "Pedro", "Michely" };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + alunos[i]);
        }

        String[] recipes = { "Bolo de limão", "Bolo de cenoura", "Pudim", "Bem casados" };
        for (int i = 0; i < recipes.length; i++) {
            System.out.println("Receita " + recipes[i]);
        }

        String formandos[] = { "Claudio", "Kleberson", "Juan", "Pedro", "Lavinia" };
        for (String aluno : formandos) {
            System.out.println("Formando " + aluno);
        }

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("J = " + j);
            j++;
        }

        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda sua mesada em doces");

        System.out.println("---------------------------------------------");
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando");
        }while(tocando());
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    private static boolean tocando(){
       /*  return ThreadLocalRandom.current().nextBoolean(); */
       boolean atendeu = new Random().nextInt(3) == 1;
       System.out.println("Atendedu? " + ((atendeu)? "Sim, atendeu":"Não atendeu"));
       return !atendeu;
    }
}
