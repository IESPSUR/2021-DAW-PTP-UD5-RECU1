package ud05arrays;

public class Virus implements Comparable<Virus>{
	
	private String nombre;
	private Integer r0;
	private Float letalidad;
	
	/**
	 * @param nombre que identifica al virus
	 * @param r0 tasa de repoducción básica
	 * @param letalidad porcentaje de infectados que fallecen entre 0 y 1
	 */
	public Virus(String nombre, Integer r0, Float letalidad) {
		this.nombre = nombre;
		this.r0 = r0;
		setLetalidad(letalidad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getR0() {
		return r0;
	}

	public void setR0(Integer r0) {
		this.r0 = r0;
	}

	public Float getLetalidad() {
		return letalidad;
	}

	public void setLetalidad(Float letalidad) {
		if(letalidad <0 || letalidad >1)
			throw new RuntimeException("Valor no válido de letalidad");
			
		this.letalidad = letalidad;
	}

	@Override
	public int hashCode() {
		return nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Virus o = (Virus)obj;
		return (this == o || nombre.equalsIgnoreCase(o.nombre));
	}

	@Override
	public int compareTo(Virus v) {
		int compare = r0 - v.r0;
		compare += compare==0 ? letalidad-v.letalidad : compare;
		return compare;
	}

	@Override
	public String toString() {
		return "Virus [nombre=" + nombre + ", r0=" + r0 + ", letalidad=" + letalidad + "]";
	}
	
	
	
}
