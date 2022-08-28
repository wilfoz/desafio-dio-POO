package one.digitalinnovation.POO;

import one.digitalinnovation.POO.domino.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Wilerson");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println("Conteúdos Inscritos" + dev1.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotaXp());

        System.out.println("-----------");

        Dev dev2 = new Dev();
        dev2.setNome("Carlos");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Inscritos" + dev2.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotaXp());
    }
}