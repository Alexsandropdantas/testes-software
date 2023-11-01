package cep;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ValidadorCepTest {

    @Test
    public void testCepValido() {
        ValidadorCep validador = new ValidadorCep();
        assertTrue(validador.validarCep("12345-678")); // CEP v�lido no formato padr�o
        assertTrue(validador.validarCep("12345678"));  // CEP v�lido sem h�fen
    }

    @Test
    public void testCepInvalido() {
        ValidadorCep validador = new ValidadorCep();
        assertFalse(validador.validarCep("1234-567"));   // CEP com n�mero insuficiente de d�gitos
        assertFalse(validador.validarCep("12345-6789")); // CEP com n�mero excessivo de d�gitos
        assertFalse(validador.validarCep("abcde-fgh"));  // CEP com caracteres n�o num�ricos
        assertFalse(validador.validarCep("123456789"));  // CEP com n�mero excessivo de d�gitos sem h�fen
        assertFalse(validador.validarCep(""));           // CEP vazio
        assertFalse(validador.validarCep(null));         // CEP nulo
    }

    @Test
    public void testCepLimiteInferior() {
        ValidadorCep validador = new ValidadorCep();
        assertTrue(validador.validarCep("00000-000")); // Limite inferior v�lido
        assertFalse(validador.validarCep("-1"));       // Valor menor que o limite inferior
    }

    @Test
    public void testCepLimiteSuperior() {
        ValidadorCep validador = new ValidadorCep();
        assertTrue(validador.validarCep("99999-999")); // Limite superior v�lido
        assertFalse(validador.validarCep("1000000000")); // Valor maior que o limite superior
    }

    @Test
    public void testCepForaDoRange() {
        ValidadorCep validador = new ValidadorCep();
        assertFalse(validador.validarCep("99999-1000")); // CEP fora do range
    }
}
