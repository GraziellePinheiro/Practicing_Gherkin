
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;


public class AprenderCucumber {


	private int contador = 0;
	@Dado("que o valor do contador é {int}")
	public void que_o_valor_do_contador_é(Integer int1) {
	    contador = int1;
	}

	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(Integer int1) {
	    contador = contador + int1;
	}

	@Então("o valor do contador será {int}")
	public void o_valor_do_contador_será(Integer int1) {
	   // System.out.println(int1);
	   // System.out.println(contador);
	    // Assert.assertTrue(int1 != contador);
	   // Assertions.assertNotEquals(int1, contador);
	    Assertions.assertEquals(int1, contador);
	   // throw new RuntimeException("Deu erro ai oh !");
	}



}
