
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import calc.Calculadora;

public class CalculadoraTest {

  @Test
  public void somaComValoresPositivos() {
    Calculadora c = new Calculadora();
    assertTrue(c.somar(1, 1) == 2);
  }
  
  @Test
  public void subtrairComValoresPositivos() {
    Calculadora c = new Calculadora();
    assertTrue(c.subtrair(5, 2) == 3);
  }
  
  @Test
  public void MultiplicarComValoresPositivos() {
    Calculadora c = new Calculadora();
    assertTrue(c.multiplicar(3, 4) == 12);
  }
  
  @Test
  public void dividirComValoresPositivos() {
    Calculadora c = new Calculadora();
    assertTrue(c.dividir(5, 2) == 3);
  }
  
  
}