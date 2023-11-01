package calc;


public class EsperaUtil {

	    public static void EsperaPorSegundos(int seconds) {
	        System.out.println("Waiting...");
	        try {
	            // Aguarda o número de segundos especificado (em milissegundos)
	            Thread.sleep(seconds * 1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("Done waiting!");
	    }
	}
