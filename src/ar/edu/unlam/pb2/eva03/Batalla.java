package ar.edu.unlam.pb2.eva03;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.setTipo(tipo);
		this.setLatitud(latitud);
		this.setLongitud(longitud);
		this.vehiculosEnLaBatalla = new TreeSet<Vehiculo>( new Comparator<Vehiculo>() {

			@Override
			public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
				return vehiculo1.getId().compareTo(vehiculo2.getId());
			}
			
		});
	}
	
	public Double getLatitud() {
		return latitud;
	}
	private void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	private void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	public TipoDeBatalla getTipo() {
		return tipo;
	}
	private void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}
	
}
