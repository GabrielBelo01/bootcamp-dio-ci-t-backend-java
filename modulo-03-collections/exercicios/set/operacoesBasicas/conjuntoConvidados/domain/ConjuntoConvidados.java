package set.operacoesBasicas.conjuntoConvidados.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoConvidados {

    private Set<Convidado> conjuntoConvidados;

    public ConjuntoConvidados() {
        conjuntoConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        conjuntoConvidados.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        if(conjuntoConvidados.isEmpty()) throw new RuntimeException("Lista vazia");

        boolean removido = conjuntoConvidados.removeIf(c -> c.getCodigoConvite() == codigoConvite);

        if(!removido){
            throw new RuntimeException("Código de convite não encontrado");
        }

    }

    public int contarConvidados(){
        return conjuntoConvidados.size();
    }

    public void exibirConvidados(){
        for(var c: conjuntoConvidados){
            System.out.println(c);
        }
    }
}
