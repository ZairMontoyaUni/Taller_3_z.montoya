package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;

public class CalculadoraTarifasTemporadaAlta  extends CalculadoraTarifas {
	protected final int COSTO_POR_KM_NATURAL = 600;
	protected final int COSTO_POR_KM_CORPOTATIVO=900;
	protected final double DESCUENTO_PEQ = 0.02;
	protected final double  DESCUENTO_MEDIANAS = 0.1;
	protected final double  DESCUENTO_GRANDES = 0.2;
	
	
	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		Aeropuerto destino = vuelo.getRuta().getDestino();
		Aeropuerto origen = vuelo.getRuta().getOrigen();
		
		int distancia =Aeropuerto.calcularDistancia(destino, origen);
		
		String clase = cliente.getTipoCliente();
		
		if(clase == "Natural") {
			return distancia * COSTO_POR_KM_NATURAL;
			
		}else if(clase == "CORPORATIVO") {
			if (cliente.getIdentificador() == "1") {
				return (int) ((DESCUENTO_PEQ * distancia) * COSTO_POR_KM_CORPOTATIVO) ;
			} else if(cliente.getIdentificador() == "2"){
				return (int) (DESCUENTO_MEDIANAS * distancia * COSTO_POR_KM_CORPOTATIVO); 
			}else if(cliente.getIdentificador() == "3") {
				return (int) (DESCUENTO_PEQ * distancia * COSTO_POR_KM_CORPOTATIVO); 
				
			}
			
		}
		
		return 0;
	}
	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		if  (cliente.getTipoCliente() == "CORPORATIVO") {
			ClienteCorporativo
			
			
		}
			
		
		return 0;
	}
	
	
	
}
