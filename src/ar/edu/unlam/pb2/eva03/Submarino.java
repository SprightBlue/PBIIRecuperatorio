package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;

public class Submarino extends Vehiculo implements Acuatico {

	private Double profundidad;
	
	public Submarino(Integer id, String nombre) {
		super(id, nombre);
		this.setProfundidad(0.0);
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

}
