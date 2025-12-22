import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Programa {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Decrição java", 8);
        Curso curso2 = new Curso("Curso JS", "Decrição js", 4);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descriçao mentoria Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp(
                "Bootcamp Java Developer",
                "Descrição Bootcamp Java Developer",
                new LinkedHashSet<>(Arrays.asList(curso1,curso2,mentoria)));


        Dev devGabriel = new Dev("Gabriel Belo");
        devGabriel.inscreverBootcamp(bootcamp);
        devGabriel.progredir();
        System.out.println("Conteudos inscritos Gabriel Belo: " + devGabriel.getConteudosIncristos());
        System.out.println("Conteudos Concluidos Gabriel Belo: " + devGabriel.getConteudosConcluidos());

        System.out.println("===================");


        Dev devJoao = new Dev("Joao Gomes");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        System.out.println("Conteudos inscritos belin play: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteudos concluidos belin play: " + devJoao.getConteudosConcluidos());

    }
}
