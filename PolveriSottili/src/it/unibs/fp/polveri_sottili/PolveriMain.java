package it.unibs.fp.polveri_sottili;

import it.unibs.fp.mylib.MyInputDati;
import it.unibs.fp.mylib.MyMenu;

public class PolveriMain {
	
	private final static int MAX_GIORNALIERO = 75;
	private final static int MAX_MEDIA = 50;
		
	private final static String MAX_GIORNALIERO_SFORATO = "ATTENZIONE: per almeno una giornata il valore supera il limite di " + MAX_GIORNALIERO;
	private final static String MAX_MEDIA_SFORATO = "ATTENZIONE: la media settimanale supera il limite di " + MAX_MEDIA;
	
	private final static String GIORNO = "Inserisci la misurazione del %d giorno: ";
	private final static String SETTIMANA = "Inserisci la settimana su cui vuoi operare: ";
	private final static String ANNO = "Inserisci l'anno su cui vuoi operare: ";
	
	private final static String TITOLO = "Controllo qualità dell'aria";
	private final static String MENU[] = {"Inserisci nuova settimana"};
	
	/**
	 * Metodo per visulizzare a schermo un messaggio di benvenuto
	 */
	private static void saluto() {
		
		System.out.println("BENEVENUTO NEL SISTEMA DI MONITORAGGIO DELLA QUALITA' DELL'ARIA\n");
	}
	
	/**
	 * Metodo per la creazione di un nuovo oggetto Settimana
	 * @param anno Anno di riferimento della settimana
	 * @param numeroSettimana Numero della settimana all'interno dell'anno
	 * @return Ritrona l'oggetto settimana
	 */
	private static Settimana creaSettimana ( int anno, int numeroSettimana ) {
		
		return new Settimana(anno, numeroSettimana);
	}
	
	/**
	 * Metodo per popolare l'array dei valori di qualità dell'aria di una data settimana
	 * @param s Settimana di riferimento
	 */
	private static void scriviSettimana(Settimana s) {
		
		double[] valori = s.getValori();
		
		for(int i = 0; i < s.getDIM(); i++ ) {
			
			valori[i] = MyInputDati.leggiDouble(String.format(GIORNO, i+1));
		}
		
	}
	
	/**
	 * Metodo per la visualizzazione della media e del massimo di una settimana.
	 * Controlla che i valori rispettino i limiti definiti 
	 * @param s Settimana di riferimento 
	 */
	private static void visualizzaSettimana(Settimana s) {
		
		System.out.println( s );
		
		if( s.getMassimo() > MAX_GIORNALIERO ) {
			System.out.println(MAX_GIORNALIERO_SFORATO);
		}
		if( s.calcolaMedia() > MAX_MEDIA ) {
			System.out.println(MAX_MEDIA_SFORATO + "\n");
		}
	}

	/**
	 * Main di Polveri sottili, permette la scelta all'utente utilizzando il menu di MyMenu
	 * @param args
	 */
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
