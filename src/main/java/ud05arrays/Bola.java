package ud05arrays;

public class Bola implements Comparable<Bola> {
	
	private static long idGenerator = 0;
	
	private long id;
	private Float diametro;
	private Float peso;
	
	public Bola () {
		initializer(0f, 0f);
	}
	
	public Bola (Float diametro, Float peso) {
		initializer(diametro, peso);
	}

	private void initializer(Float diametro, Float peso) {
		id = ++idGenerator;
		this.diametro = diametro;
		this.peso = peso;
	}
	
	@Override
	public int hashCode() {
		return (int)(diametro*peso);
	}

	@Override
	public boolean equals(Object obj) {
		Bola otra = (Bola) obj;
		return (this==otra) || 
				(diametro.equals(otra.diametro) && peso.equals(otra.peso));
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return id + ":(" + diametro + "," + peso +")";
	}

	/**
	 * @return the diametro
	 */
	public Float getDiametro() {
		return diametro;
	}

	/**
	 * @param diametro the diametro to set
	 */
	public void setDiametro(Float diametro) {
		this.diametro = diametro;
	}

	/**
	 * @return the peso
	 */
	public Float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Float peso) {
		this.peso = peso;
	}

	@Override
	public int compareTo(Bola o) {
		int iguales = diametro.compareTo(o.diametro);
		if(iguales==0)
			iguales = peso.compareTo(o.peso);
		return iguales;
	}
	
	

}
