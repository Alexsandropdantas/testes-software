package cep;


public class ValidadorCep {

    public boolean validarCep(String cep) {
        // Verifica se o CEP não é nulo e possui o formato correto (xxxxx-xxx ou xxxxxxxx)
        if (cep != null && (cep.matches("\\d{5}-\\d{3}") || cep.matches("\\d{8}"))) {
            // Extrai apenas os dígitos do CEP
            String numerosCep = cep.replaceAll("\\D", "");
            // Converte os dígitos em um número inteiro para validar
            int numeroCep = Integer.parseInt(numerosCep);
            // Verifica se o número do CEP está dentro do range válido (00000000 a 99999999)
            return numeroCep >= 0 && numeroCep <= 99999999;
        }
        return false;
    }
}
