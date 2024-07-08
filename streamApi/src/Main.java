import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

public class Main {
    public static void main(String[] args) {
//        // Criar uma lista de números inteiros
//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
//
//        // Usar o Consumer com expressão lambda para imprimir números pares
//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//        };
//
//        // Usar o Consumer para imprimir números pares no Stream
//        numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);

//        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
//        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
//
//        // Usar o Supplier para obter uma lista com 5 saudações
//        List<String> listaSaudacoes = Stream.generate(saudacao)
//                .limit(5)
//                .toList();
//
//        // Imprimir as saudações geradas
//        listaSaudacoes.forEach(System.out::println);

//        // Criar uma lista de números inteiros
//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
//
//        // Usar a Function com expressão lambda para dobrar todos os números
//        Function<Integer, Integer> dobrar = numero -> numero * 2;
//
//        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
//        List<Integer> numerosDobrados = numeros.stream()
//                .map(n -> n * 2)
//                .toList();
//
//        // Imprimir a lista de números dobrados
//        numerosDobrados.forEach(System.out::println);


//        // Criar uma lista de palavras
//        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");
//
//        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
//        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
//
//        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
//        // imprimir cada palavra que passou no filtro
//        palavras.stream()
//                .filter(maisDeCincoCaracteres)
//                .forEach(System.out::println);

        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = Integer::sum;

        // Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);

    }
}