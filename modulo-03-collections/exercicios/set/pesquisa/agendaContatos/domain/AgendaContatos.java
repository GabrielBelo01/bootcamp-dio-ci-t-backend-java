package set.pesquisa.agendaContatos.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AgendaContatos {

    private Set<Contato> setConjutoContatos;

    public AgendaContatos() {
        setConjutoContatos = new HashSet<>();
    }

    public Set<Contato> getSetConjutoContatos() {
        return setConjutoContatos;
    }

    public void adicionarContato(String name, int numero){
        setConjutoContatos.add(new Contato(name,numero));
    }

    public void exibirContatos(){
        for(var c: setConjutoContatos){
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisarPorNome(String name){
        if(setConjutoContatos.isEmpty()) throw new RuntimeException("Conjunto vazio");

        return setConjutoContatos.stream()
                .filter(c -> c.getNome().equalsIgnoreCase(name))
                .collect(Collectors.toSet());
    }

    public void atualizarNumeroContato(int numero, int novoNumero){
        Contato contatoParaAtualizar = null;

        for(var c: setConjutoContatos){
            if(c.getNumeroTelefone()==numero){
                contatoParaAtualizar = c;
                break;
            }
        }

        if (contatoParaAtualizar == null) throw new RuntimeException("Contato não encontrado");

        setConjutoContatos.remove(contatoParaAtualizar);
        contatoParaAtualizar.setNumeroTelefone(novoNumero);
        setConjutoContatos.add(contatoParaAtualizar);
    }


}
