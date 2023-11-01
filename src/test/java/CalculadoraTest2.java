import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calc.Calculadora;

public class CalculadoraTest2 {
  Calculadora c;

  @Before
  public void inicializacao() {
    c = new Calculadora();
    System.out.println("Iniciando método");
  }
  
  @Test
  public void somaComValoresPositivos() {
    assertTrue(c.somar(1, 1) == 2);
  }

  @Test
  public void somaComValoresNegativos() {
    assertTrue(c.somar(-1, -1) == -2);
  }
  
  
  @After
  public void finalizacao() {
	c = null;
    System.out.println("Finalizado método");
  }
  
  
}