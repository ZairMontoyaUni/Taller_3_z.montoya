package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {
	protected final int  COSTO_POR_KM = 1000;

	
	
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		Aeropuerto destino = vuelo.getRuta().getDestino();
		Aeropuerto origen = vuelo.getRuta().getOrigen();
		
		int distancia = Aeropuerto.calcularDistancia(destino, origen);
		
		
		return distancia * COSTO_POR_KM;
	}

	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}

	

}

