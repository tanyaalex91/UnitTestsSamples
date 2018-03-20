package by.htp.logic;

import static org.junit.Assert.*;

import org.junit.Test;

import by.htp.MainApp.Romashka;

public class TestPetalsCount {

	private Romashka romashka;
	
	
	
	@Test
	public void test() {
		romashka = new Romashka();
		int petals = romashka.getSize();
		assertTrue(petals>=1&&petals<=10);
		
	}

	
	
	
}
