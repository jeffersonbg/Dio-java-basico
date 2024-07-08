import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEvento;

    public AgendaEventos() {
        agendaEvento = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaEvento.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEvento);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximaEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agendaEvento);
        for (Map.Entry<LocalDate, Evento> entry : agendaEvento.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximaEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximaEvento + " acontecerá na data " + proximaData);
                break;
            }
        }

    }

}
