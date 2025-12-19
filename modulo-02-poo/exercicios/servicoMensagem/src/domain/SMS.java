package domain;

public class SMS implements ServicoMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando sms: "+ mensagem);
    }
}
