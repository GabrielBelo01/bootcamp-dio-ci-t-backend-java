package domain;

public class WhatsApp implements ServicoMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando whatsapp: "+ mensagem);
    }
}
