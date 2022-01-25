import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Phillipe");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Phillipe:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Phillipe:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Phillipe:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devNanda = new Dev();
        devNanda.setNome("Nanda");
        devNanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nanda:" + devNanda.getConteudosInscritos());
        devNanda.progredir();
        devNanda.progredir();
        devNanda.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nanda:" + devNanda.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Nanda:" + devNanda.getConteudosConcluidos());
        System.out.println("XP:" + devNanda.calcularTotalXp());

    }

}
