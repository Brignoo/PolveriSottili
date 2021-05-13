package it.unibs.fp.polveri_sottili;

import it.unibs.fp.mylib.MyInputDati;
import it.unibs.fp.mylib.MyMenu;

public class PolveriMain {
	
	private final static int GIORNI_SETTIMANA = 7;
	private final static int MAX_GIORNALIERO = 75;
	private final static int MAX_MEDIA = 50;
	
	
	private final static String MAX_GIORNALIERO_SFORATO = "E' STATO SFORATO IL LIMITE MASSIMO GIORNALIERO";
	private final static String MAX_MEDIA_SFORATO = "E' STATO SFORATO IL LIMITE MASSIMO DELLA MEDIA SETTIMANALE";
	
	private final static String GIORNO = "Inserisci la misurazione del %d giorno: ";
	private final static String SETTIMANA = "Inserisci la settimana su cui vuoi operare: ";
	private final static String ANNO = "Inserisci l'anno su cui vuoi operare: ";
	
	private final static String TITOLO = "Controllo qualità dell'aria";
	private final static String MENU[] = {"Inserisci nuova settimana"};
	
	private static void saluto() {
		
		System.out.println("BENEVENUTO NEL SISTEMA DI MONITORAGGIO DELLA QUALITA' DELL'ARIA\n");
	}
	
	private static Settimana creaSettimana ( int anno, int numeroSettimana ) {
		
		return new Settimana(anno, numeroSettimana);
	}
	
	private static void scriviSettimana(Settimana s) {
		
		
	}
	
	private static void visualizzaSettimana(Settimana s) {
		
		
	}

	public static void main(String[] args) {
		
		int scelta = 0, anno, settimana;
		Settimana s;
		
		saluto();
		
		anno = MyInputDati.leggiInteroNonNegativo(ANNO);
		
		MyMenu menu = new MyMenu(TITOLO + " " + anno, MENU);
		
		do {
			
			scelta = menu.scegli();
			
			switch(scelta) {
			
			case 1:
				settimana = MyInputDati.leggiIntero(SETTIMANA, 1, 53);
				s = creaSettimana(anno, settimana);
				
				scriviSettimana( s );
				visualizzaSettimana( s );
				
				break;
				
			}
			
			
		}
		while( scelta != 0 );
		
	}
}
