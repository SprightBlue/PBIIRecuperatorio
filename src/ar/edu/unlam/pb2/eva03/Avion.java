package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Avion extends Vehiculo implements Volador {
	
	private Double altura;

	public Avion(Integer id, String nombre) {
		super(id, nombre);
		this.setAltura(0.0);
	}

	@Override
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

}
