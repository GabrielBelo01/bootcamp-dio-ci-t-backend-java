package dio.web.api.handler;

public class CampoObrigatorioExecption extends BusinessException{
    public CampoObrigatorioExecption(String campo) {
        super("O campo %s é obrigatorio", campo);
    }
}
