import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();  //classe é como se fosse a planta de uma casa, objeto como se fosse a casa contruída
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(mentoria1);
        //System.out.println(curso2);

        //Conteudo conteudo = new Conteudo();   não permite, pois caonteudo é uma classe abstrata
        //Conteudo conteudo = new Curso();  //polimorfismo. instanciou umcurso a partir de conteudo

        //estanciar bootcamp e criar 2 devs pra participar do bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Code Girls");
        bootcamp.setDescricao("Bootcamp Java voltado para devs mulheres");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMaira = new Dev();
        devMaira.setNome("Maira");
        devMaira.inscreverBootcamp(bootcamp);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Maíra: " + devMaira.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP Maíra: " + devMaira.calcularTotalXp());

        devMaira.progredir();
        devMaira.progredir();
        devMaira.progredir();

        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteúdos concluídos Maíra: " + devMaira.getConteudosConcluidos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP Maíra: " + devMaira.calcularTotalXp());
        System.out.println("XP Camila: " + devCamila.calcularTotalXp());
        System.out.println("Conteúdos inscritos Maíra: " + devMaira.getConteudosInscritos());
    }
}
