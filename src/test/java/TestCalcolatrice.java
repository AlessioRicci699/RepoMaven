import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCalcolatrice {

	@Test
	void testSomma() {
		Calcolatrice c = new Calcolatrice();
		double res = c.Somma(5, 6);
		Assert.assertEquals(11,res,0);
	}
	
	void testSomma2() {
		Calcolatrice c = new Calcolatrice();
		double res = c.Somma(5, 0);
		Assert.assertEquals(5,res,0);
	}

}
