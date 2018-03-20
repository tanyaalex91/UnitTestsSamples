package by.htp.logic;


import org.junit.Assert;
import org.junit.Test;

import by.htp.MainApp.Gadalka;

public class TestFlower {
	
	private Gadalka gadalka;
	

	

	@Test
	public void test() {
		
		gadalka = new Gadalka();
		Assert.assertNotNull("gadaniya is not initilalized",gadalka.getGadaniya());
		
		
	}

}
