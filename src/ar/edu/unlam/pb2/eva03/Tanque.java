package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;

public class Tanque extends Vehiculo implements Terrestre {
	
	private Double velocidad;

	public Tanque(Integer id, String nombre) {
		super(id, nombre);
		this.setVelocidad(0.0);
	}

	@Override
	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

}
