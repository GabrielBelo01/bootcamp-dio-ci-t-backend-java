package subsistema2.cep;

public class CepAPI {

    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
    }

    public static CepAPI getInstance(){
        return instancia;
    }


    public String recuperarCidade(String cep){
        return "Itu-SP";
    }

    public String recuperarEstado(String cep){
        return "São-Paulo";
    }
}
