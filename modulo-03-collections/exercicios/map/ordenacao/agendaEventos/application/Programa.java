package map.ordenacao.agendaEventos.application;

import map.ordenacao.agendaEventos.domain.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;

public class Programa {
    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
        agendaEventos.adicionarEvento(LocalDate.of(2027, 9, 20), "Java Avançado", "Discussão sobre Java avançado");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
