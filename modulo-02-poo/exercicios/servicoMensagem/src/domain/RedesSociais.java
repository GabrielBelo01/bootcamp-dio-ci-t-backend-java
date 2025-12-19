package domain;

public class RedesSociais implements ServicoMensagem {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Postando redes sociais: "+ mensagem);
    }
}
