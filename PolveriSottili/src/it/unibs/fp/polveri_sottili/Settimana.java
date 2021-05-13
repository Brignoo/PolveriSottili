package it.unibs.fp.polveri_sottili;

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

	public double[] getValori() {
		return valori;
	}

	public void setValori(double[] valori) {
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
	
	public double getMassimo(){
		double max=valori[0];
		for (double d : valori) {
			if(max<d)
				max=d;
		}
		return max;
	}

	public double calcolaMedia(){
		double media=0;
		for (double d : valori) {
			media+=d;
		}
		return media/DIM;
	}
	
}