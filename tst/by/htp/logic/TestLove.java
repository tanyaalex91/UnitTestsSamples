package by.htp.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import by.htp.MainApp.Client;
import by.htp.MainApp.Gadalka;
import by.htp.MainApp.Gadanie;
import by.htp.MainApp.Romashka;

public class TestLove {

	private Gadalka gadalka;
	private Client client;
	private Romashka rom1;
	private Romashka rom2;
	private Gadanie gad1;
	private Gadanie gad2;
	private Gadanie gad3;

	private String[] loveVariants = { "love1", "love2", "love3", "love4", "love5" };

	@Before

	public void initData() {
		rom1 = new Romashka();
		rom2 = new Romashka();

		gadalka = new Gadalka();

		gadalka.getRomashki().add(rom1);
		gadalka.getRomashki().add(rom2);

		Gadanie gad1 = new Gadanie("work");
		Gadanie gad2 = new Gadanie("love");
		Gadanie gad3 = new Gadanie("fortune");

		gadalka.addGadanie(gad1);
		gadalka.addGadanie(gad2);
		gadalka.addGadanie(gad3);
		
		 client = new Client();
	}

	@Test
	public void test() {

		
		String res = client.askGadalkaPogadat("love", gadalka);
		for (String str : loveVariants) {
			if (str.equals(res))
				assertTrue(str.equals(res));
		}
	}

}
