package uniandes.dpoo.aerolinea.modelo;

import java.util.ArrayList;
import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {

	private String fecha;
	private ArrayList<Tiquete> tiquetes; 
	private Avion avion;
	private Ruta ruta;
	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		super();
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
	}
	public String getFecha() {
		return fecha;
	}
	public Collection<Tiquete> getTiquetes() {
		return tiquetes;
	}
	public Avion getAvion() {
		return avion;
	}
	public Ruta getRuta() {
		return ruta;
	}
	
	public int vender(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		
		return -1;
	}
	
	
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true; // Same reference
	    }
	    else if (obj == null || getClass() != obj.getClass()) {
	        return false; // Null check and class comparison
	    }
	    
	    return false;
	   
	}

	
}
