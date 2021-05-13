package it.unibs.fp.polveri_sottili;

public class PolveriMain {
	
	private final static int GIORNI_SETTIMANA = 7;
	private final static int MAX_GIORNALIERO = 75;
	private final static int MAX_MEDIA = 50;
	private final static String NUOVO_GIORNO = "Inserisci la misurazione di oggi: ";
	private final static String MAX_GIORNALIERO_SFORATO = "E' STATO SFORATO IL LIMITE MASSIMO GIORNALIERO";
	private final static String MAX_MEDIA_SFORATO = "E' STATO SFORATO IL LIMITE MASSIMO DELLA MEDIA SETTIMANALE";
	
	private static void saluto() {
		
		System.out.println("BENEVENUTO NEL SISTEMA DI MONITORAGGIO DELLA QUALITA' DELL'ARIA\n");
	}

	public static void main(String[] args) {
		
		Settimana s;
		int scelta = 0;
		
		System.out.println("Inserisci l'anno");
		
		int anno = 2010;
		
		do {
			
			System.out.println("Quale settimana vuoi inserire?");
			
			int num = 15;
			
		}
		while( scelta != 0 );
		
	}
}
