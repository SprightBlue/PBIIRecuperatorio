package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Volador, Acuatico {
	
	private Double profundidad;
	private Double altura;

	public HidroAvion(Integer id, String nombre) {
		super(id, nombre);
		this.setProfundidad(0.0);
		this.setAltura(0.0);
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public Double getAltura() {
		return altura;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
