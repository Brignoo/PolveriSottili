package it.unibs.fp.polveri_sottili;

public class Settimana {

	private static final int DIM = 7;
	
	private int valori[];
	private int numeroSettimana;
	private int anno;
	
	public Settimana(int anno, int numeroSettimana) {
		
		this.valori = new int[DIM];
		this.anno = anno;
		this.numeroSettimana = numeroSettimana;
	}

	public int[] getValori() {
		return valori;
	}

	public void setValori(int[] valori) {
		this.valori = valori;
	}

	public int getNumeroSettimana() {
		return numeroSettimana;
	}

	public void setNumeroSettimana(int numeroSettimana) {
		this.numeroSettimana = numeroSettimana;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
	
	
}
