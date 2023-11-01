import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calc.Calculadora;
import calc.EsperaUtil;

public class CalculadoraTest3 {
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
  
    
  @Test (timeout=1000) 
  public void somaComValoresNegativos() {
	EsperaUtil.EsperaPorSegundos(2);
    assertTrue(c.somar(-3, -3) == -6);
  }
  
  
  @After
  public void finalizacao() {
    c = new Calculadora();
    System.out.println("Finalizado método");
  }
  
  
  
  
  
}