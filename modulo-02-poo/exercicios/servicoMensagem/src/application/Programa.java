package application;

import domain.Email;
import domain.RedesSociais;
import domain.SMS;
import domain.ServicoMensagem;
import domain.WhatsApp;

public class Programa {
    public static void main(String[] args) {
        String mensagem = "Promoção especial: 50% de desconto!";


        ServicoMensagem[] servicos = {
                new SMS(),
                new Email(),
                new RedesSociais(),
                new WhatsApp()
        };

        for (ServicoMensagem servico : servicos) {
            servico.enviarMensagem(mensagem);
        }
    }
}
