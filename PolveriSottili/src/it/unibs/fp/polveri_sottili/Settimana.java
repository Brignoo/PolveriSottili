package it.unibs.fp.polveri_sottili;

/**
 * Classe contenente l'array di valori, l'anno di riferimento e il numero della settimana presa in esame
 */
public class Settimana {

	private static final int DIM = 7;
	
	private double valori[];
	private int numeroSettimana;
	private int anno;
	
	public Settimana(int anno, int numeroSettimana) {
		
		this.valori = new double[DIM];
		this.anno = anno;
		this.numeroSettimana = numeroSettimana;
	}

	
	/** Get array valori
	 * @return double[] Ritorna un'array dei valori
	 */
	public double[] getValori() {
		return valori;
	}

	
	/** Effetua un set dei vlaori
	 * @param valori I valori presi in input verrano settati
	 */
	public void setValori(double[] valori) {
		this.valori = valori;
	}

	
	/** Get del numeroSettimana
	 * @return int retrun del valore richiesto
	 */
	public int getNumeroSettimana() {
		return numeroSettimana;
	}

	
	/** set del numero settimana
	 * @param numeroSettimana Parametro che verrà utilizzato per settare la variabile numeroSettimana
	 */
	public void setNumeroSettimana(int numeroSettimana) {
		this.numeroSettimana = numeroSettimana;
	}

	
	/** Get anno
	 * @return int return dell'anno desiderato
	 */
	public int getAnno() {
		return anno;
	}

	
	/** Set anno
	 * @param anno numero che verrà utilizzato come valore dell'anno
	 */
	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	
	/** Calcola il valore massimo di una settimana
	 * @return double effettua il return del valore massimo della settimana
	 */
	public double getMassimo(){
		double max=valori[0];
		for (double d : valori) {
			if(max<d)
				max=d;
		}
		return max;
	}

	
	/** Calcola la media di una specifica settimana
	 * @return double Restituisce il valore della media delle misure di quella settimana
	 */
	public double calcolaMedia(){
		double media=0;
		for (double d : valori) {
			media+=d;
		}
		return media/DIM;
	}

	
	/** Effettua il to string dei valori di una settimana
	 * @return String In questa String sono riportati i valori delle misurazioni di una settimana
	 */
	public String toStringValori(){
		String temp= "\nValori: ";
		for (double d : valori) {
			temp += d+", ";
		}
		return temp.substring(0, temp.length()-2)+".";
	}
	
	
	/** Effetua il get del DIM
	 * @return int Return del parametro DIM
	 */
	public int getDIM(){
		return DIM;
	}

	
	/** Effettua il to string di questa classe
	 * @return String All'interno di questa stinga vengono riportati tutti i parametri di una settimana
	 */
	public String toString(){
		return "\nAnno: " + anno + "\t\t\tSettimana: " + numeroSettimana 
		+ "\nMassimo giornaliero: " + String.format("%.2f", getMassimo()) + "\tMedia settimanale: " + String.format("%.2f", calcolaMedia()) + "\n";
	}
	
}