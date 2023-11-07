package ar.edu.unlam.pb2.eva03;

import java.util.TreeSet;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoIncompatible;
import ar.edu.unlam.pb2.eva03.excepciones.VehiculoInexistente;
import ar.edu.unlam.pb2.eva03.interfaces.Acuatico;
import ar.edu.unlam.pb2.eva03.interfaces.Terrestre;
import ar.edu.unlam.pb2.eva03.interfaces.Volador;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy = new TreeSet<Vehiculo>(new Comparator<Vehiculo>() {

			@Override
			public int compare(Vehiculo vehiculo1, Vehiculo vehiculo2) {
				return vehiculo1.getId().compareTo(vehiculo2.getId());
			}
			
		});
		this.batallas = new TreeMap<String, Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, double latitud, double longitud) {
		if(!this.batallas.containsKey(nombre)) {
			this.batallas.put(nombre, new Batalla(tipo, latitud, longitud));
		}
		
	}

	public Batalla getBatalla(String nombre) {
		return this.batallas.get(nombre);
	}

	public boolean enviarALaBatalla(String nombre, Integer idVehiculo) throws VehiculoInexistente, VehiculoIncompatible {
		boolean resultado = false;
		Vehiculo vehiculoBuscado = this.buscarVehiculo(idVehiculo);
		if(vehiculoBuscado==null || !this.convoy.contains(vehiculoBuscado)) {
			throw new VehiculoInexistente();
		}
		switch(this.batallas.get(nombre).getTipo()) {
		case AEREA:
			if(vehiculoBuscado instanceof Volador) {
				resultado = this.batallas.get(nombre).vehiculosEnLaBatalla.add(vehiculoBuscado);
			}else {
				throw new VehiculoIncompatible();
			}
			break;
		case NAVAL:
			if(vehiculoBuscado instanceof Acuatico) {
				resultado = this.batallas.get(nombre).vehiculosEnLaBatalla.add(vehiculoBuscado);
			}else {
				throw new VehiculoIncompatible();
			}
			break;			
		case TERRESTRE:
			if(vehiculoBuscado instanceof Terrestre) {
				resultado = this.batallas.get(nombre).vehiculosEnLaBatalla.add(vehiculoBuscado);
			}else {
				throw new VehiculoIncompatible();
			}
			break;
		}
		return resultado;
	}
	
	private Vehiculo buscarVehiculo(Integer idVehiculo) {
		Vehiculo vehiculoBuscado = null;
		boolean encontrado = false;
		Iterator<Vehiculo> iterador = this.convoy.iterator();
		while(!encontrado && iterador.hasNext()) {
			Vehiculo vehiculoIterado = iterador.next();
			if(vehiculoIterado.getId().equals(idVehiculo)) {
				vehiculoBuscado = vehiculoIterado;
				encontrado = true;
			}
		}
		return vehiculoBuscado;
	}

}
