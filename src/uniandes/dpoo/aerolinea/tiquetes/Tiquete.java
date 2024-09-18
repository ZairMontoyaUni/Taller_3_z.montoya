package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	
	private String codigo;
	private int tarifa;
	private boolean usado;
	private Cliente cliente;
	private Vuelo vuelo;
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		super();
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.cliente = clienteComprador;
		this.vuelo = vuelo;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public void marcarComoUsado() {
		usado = true; 
	}
	public boolean esUsado() {
		if(usado == true) {
			return true;
			
		}else {
			
			return false;
		}
		
	}
	
}
