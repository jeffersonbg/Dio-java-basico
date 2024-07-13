import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoUm = new Curso();
        cursoUm.setTitulo("curso java");
        cursoUm.setDescricao("Descrição: Curso Java");
        cursoUm.setCargaHoraria(8);

        Curso cursoDois = new Curso();
        cursoDois.setTitulo("curso JS");
        cursoDois.setDescricao("Descrição: Curso JS");
        cursoDois.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo2 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição: Mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(cursoUm);
//        System.out.println(cursoDois);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Abstraindo bootcamp");
        bootcamp.getConteudos().add(cursoUm);
        bootcamp.getConteudos().add(cursoDois);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularXP());

        System.out.println("..................................................................");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularXP());





    }
}