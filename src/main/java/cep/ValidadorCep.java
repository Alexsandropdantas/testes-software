package cep;


public class ValidadorCep {

    public boolean validarCep(String cep) {
        // Verifica se o CEP n�o � nulo e possui o formato correto (xxxxx-xxx ou xxxxxxxx)
        if (cep != null && (cep.matches("\\d{5}-\\d{3}") || cep.matches("\\d{8}"))) {
            // Extrai apenas os d�gitos do CEP
            String numerosCep = cep.replaceAll("\\D", "");
            // Converte os d�gitos em um n�mero inteiro para validar
            int numeroCep = Integer.parseInt(numerosCep);
            // Verifica se o n�mero do CEP est� dentro do range v�lido (00000000 a 99999999)
            return numeroCep >= 0 && numeroCep <= 99999999;
        }
        return false;
    }
}
