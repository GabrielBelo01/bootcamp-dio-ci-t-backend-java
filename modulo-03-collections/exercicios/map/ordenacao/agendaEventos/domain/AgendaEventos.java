package map.ordenacao.agendaEventos.domain;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private final Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> treeMap = new TreeMap<>(eventosMap);

        treeMap.forEach((data,evento) -> System.out.println("Data: " + data + " | Evento: " + evento));
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();

//        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
//        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
//            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
//                System.out.println("O proximo evento: " + entry.getValue() + " acontecera na data " + entry.getKey());
//                break;
//            }
//        }

        eventosMap.entrySet()
                .stream()
                .filter(e -> e.getKey().isEqual(dataAtual) || e.getKey().isAfter(dataAtual))
                .min(Map.Entry.comparingByKey())
                .ifPresent(e -> System.out.println("o proximo evento: " + e.getValue() + " acontecera na data " + e.getKey()));

    }
}
