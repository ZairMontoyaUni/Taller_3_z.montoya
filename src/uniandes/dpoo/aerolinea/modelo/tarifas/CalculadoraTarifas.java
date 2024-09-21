package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {

	public final double IMPUESTO = 0.28; 
	
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente){
		return (int) Math.round(calcularCostoBase( vuelo,  cliente) * IMPUESTO);
	}
	
	protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
		
	protected abstract double calcularPorcentajeDescuento(Cliente cliente);
	
	protected int calcularDistanciaVuelo(Ruta ruta){
		Aeropuerto destino = ruta.getDestino();
		Aeropuerto origen = ruta.getOrigen();
		
		int distancia = Aeropuerto.calcularDistancia(destino, origen);
		return distancia;
		
	}
	protected int calcularValorImpuestos(int costoBase){
		return (int) ((costoBase*IMPUESTO) - costoBase) ;
	}
	
	
}
