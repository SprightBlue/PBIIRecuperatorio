package ar.edu.unlam.pb2.eva03;

public abstract class Vehiculo {

	protected Integer id;
	protected String nombre;

	public Vehiculo(Integer id, String nombre) {
		this.setId(id);
		this.setNombre(nombre);
	}
	
	public Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
