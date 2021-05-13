package it.unibs.fp.polveri_sottili;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PolveriTest {
	
	private static final int MEDIA = 50;
	private static final int GIORNO = 75;
	
	@Test
	public void tuttoOk() throws Exception 
	{
		final Settimana s = new Settimana(2021, 12);
		double val[] = {12, 13, 14, 15, 16, 17, 18};
		s.setValori(val);
		assertTrue(s.calcolaMedia() < MEDIA);
		assertTrue(s.getMassimo() < GIORNO);
	}
	
	@Test
	public void mediaElevata() throws Exception 
	{
		final Settimana s = new Settimana(2021, 12);
		double val[] = {60, 63, 68, 70, 61, 60, 71};
		s.setValori(val);
		assertFalse(s.calcolaMedia() < MEDIA);
		assertTrue(s.getMassimo() < GIORNO);
	}
	
	@Test
	public void giornoMaggiore() throws Exception 
	{
		final Settimana s = new Settimana(2021, 12);
		double val[] = {99, 33, 28, 12, 24, 11, 15};
		s.setValori(val);
		assertTrue(s.calcolaMedia() < MEDIA);
		assertFalse(s.getMassimo() < GIORNO);
	}

	@Test
	public void valoriFuoriRange() throws Exception 
	{
		final Settimana s = new Settimana(2021, 12);
		double val[] = {120, 61, 98, 107, 71, 59, 88};
		s.setValori(val);
		assertFalse(s.calcolaMedia() < MEDIA);
		assertFalse(s.getMassimo() < GIORNO);
	}
}
