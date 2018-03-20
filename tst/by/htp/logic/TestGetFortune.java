package by.htp.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import by.htp.MainApp.Client;
import by.htp.MainApp.Gadalka;
import by.htp.MainApp.Gadanie;
import by.htp.MainApp.Romashka;

public class TestGetFortune {

	private Gadalka gadalka;
	private Romashka rom1;
	private Romashka rom2;
	private Gadanie gad1;
	private Gadanie gad2;
	private Gadanie gad3;
	private Client cl;

	@Before
	public void initData() {
		rom1 = new Romashka();
		rom2 = new Romashka();

		gadalka = new Gadalka();

		gadalka.getRomashki().add(rom1);
		gadalka.getRomashki().add(rom2);

		gad1 = new Gadanie("work");
		gad2 = new Gadanie("love");
		gad3 = new Gadanie("fortune");

		gadalka.addGadanie(gad1);
		gadalka.addGadanie(gad2);
		gadalka.addGadanie(gad3);

		 cl = new Client();
	}

	@Test
	public void test() {

		String res = cl.askGadalkaPogadat("love", gadalka);

		assertTrue(res != null);
	}

}
