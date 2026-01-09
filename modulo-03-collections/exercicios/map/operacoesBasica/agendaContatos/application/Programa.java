package map.operacoesBasica.agendaContatos.application;

import map.operacoesBasica.agendaContatos.domain.AgendaContatos;

public class Programa {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gabriel", 975743954);
        agendaContatos.adicionarContato("Gabriel", 975434324);
        agendaContatos.adicionarContato("Blue Pink", 943434954);
        agendaContatos.adicionarContato("Marron Blue", 946534954);
        agendaContatos.adicionarContato("Limon Ice", 945345434);
        agendaContatos.adicionarContato("Hostel Lilo", 945345434);

        agendaContatos.exibirContatos();



        agendaContatos.removerContato("LiMon Ice");
        agendaContatos.exibirContatos();

        System.out.println("-----");
        System.out.println();
        System.out.println();
        System.out.println("-----");

        System.out.println(agendaContatos.pesquisarPorNome("gabriel"));
    }
}
