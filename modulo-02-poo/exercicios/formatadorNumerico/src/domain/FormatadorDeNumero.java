package domain;

public class FormatadorDeNumero {

    public static String formatar(String entrada) {
        String numeros = entrada.replaceAll("\\D", "");

        if (numeros.length() < 8 || numeros.length() > 11) {
            return "Entrada inválida: número de dígitos incorreto";
        }

        switch (numeros.length()) {
            case 8:  return "Telefone fixo sem DDD: " + formatarFixoSemDDD(numeros);
            case 9:  return "Celular sem DDD: " + formatarCelularSemDDD(numeros);
            case 10: return "Telefone fixo com DDD: " + formatarFixoComDDD(numeros);
            case 11: return "Celular com DDD: " + formatarCelularComDDD(numeros);
            default: return "Entrada inválida";
        }
    }

    private static String formatarFixoSemDDD(String numeros) {
        StringBuilder sb = new StringBuilder(numeros);
        sb.insert(4, "-");
        return sb.toString();

    }

    private static String formatarCelularSemDDD(String numeros) {
        StringBuilder sb = new StringBuilder(numeros);
        sb.insert(5, "-");
        return sb.toString();
    }

    private static String formatarFixoComDDD(String numeros) {
        return formatarComDDD(numeros, false);
    }

    private static String formatarCelularComDDD(String numeros) {
        return formatarComDDD(numeros, true);
    }

    private static String formatarComDDD(String numeros, boolean celular) {
        StringBuilder sb = new StringBuilder(numeros);
        sb.insert(0, "(");
        sb.insert(3, ")");
        if(celular){
            sb.insert(8, "-"); // celular com DDD (xx)xxxxx-xxxx
        } else {
            sb.insert(7, "-"); // fixo com DDD (xx)xxxx-xxxx
        }
        return sb.toString();
    }



}
