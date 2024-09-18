package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {

	protected ArrayList<Tiquete>tiquetesSinUsar;
	protected ArrayList<Tiquete>tiquetesUsados;
	public Cliente() {
		
	}
	
	public  abstract String getTipoCliente() ;
	
	
	public  abstract String getIdentificador();
	
	
	public void agregarTiquete(Tiquete tiquete) {
		
	}
	
	public int calcularValorTotalTiquetes() {
		
		return -1;
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		
	}
	
}
