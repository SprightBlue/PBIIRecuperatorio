package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {
	
	private Double profundidad;
	private Double velocidad;

	public Anfibio(Integer id, String nombre) {
		super(id, nombre);
		this.setProfundidad(0.0);
		this.setVelocidad(0.0);
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public Double getVelocidad() {
		return velocidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

}
