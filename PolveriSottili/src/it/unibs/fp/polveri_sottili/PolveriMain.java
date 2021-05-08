package it.unibs.fp.polveri_sottili;

public class PolveriMain {
	private final static int GIORNI_SETTIMANA = 7;
	private final static int MAX_GIORNALIERO = 75;
	private final static int MAX_MEDIA = 50;
	private final static String NUOVO_GIORNO = "Inserisci la misurazione di oggi: ";
	private final static String MAX_GIORNALIERO_SFORATO = "E' STATO SFORATO IL LIMITE MASSIMO GIORNALIERO";
	private final static String MAX_MEDIA_SFORATO = "E' STATO SFORATO IL LIMITE MASSIMO DELLA MEDIA SETTIMANALE";
	private final static String MAX_MEDIA_SFORATO = "Vuoi uscire? ";

	public static void main(String[] args) {
		Double[] settimana= new Double[GIORNI_SETTIMANA];
		boolean uscita=true;
		do{
			Double max=0.0, media=0.0;
			for(int i=0; i<GIORNI_SETTIMANA; i++){
				settimana[i]=MyInputDati.leggiDoubleConMinimo ( NUOVO_GIORNO , 0);
				media+=settimana[i];
				if(settimana[i]>max){
					max=settimana[i];
				}
			}
			media=media/GIORNI_SETTIMANA;
			if(max>MAX_GIORNALIERO){
				System.out.println(MAX_GIORNALIERO_SFORATO);
			}
			if(media>MAX_MEDIA){
				System.out.println(MAX_MEDIA_SFORATO);
			}
			uscita=!MyInputDati.yesOrNo();
		}while(uscita);
	}
}