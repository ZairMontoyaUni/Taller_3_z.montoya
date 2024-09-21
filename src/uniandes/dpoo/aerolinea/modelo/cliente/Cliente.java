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
        int total = 0;
        for (Tiquete tiquete : tiquetesSinUsar) {
            total += tiquete.getTarifa(); // Asumiendo que hay un método getPrecio en Tiquete
        }
        return total;
    }

    /**
     * Marca los tiquetes como usados para un vuelo específico.
     * @param vuelo El vuelo que se está usando.
     */
    public void usarTiquetes(Vuelo vuelo) {
        // Aquí podrías implementar la lógica para marcar los tiquetes como usados
        ArrayList<Tiquete> tiquetesAUsar = new ArrayList<>();
        
        for (Tiquete tiquete : tiquetesSinUsar) {
            if (tiquete.getVuelo().equals(vuelo)) { // Asumiendo que Tiquete tiene un método getVuelo
                tiquetesAUsar.add(tiquete);
            }
        }

        // Mover los tiquetes usados de tiquetesSinUsar a tiquetesUsados
        for (Tiquete tiquete : tiquetesAUsar) {
            tiquetesSinUsar.remove(tiquete);
            tiquetesUsados.add(tiquete);
        }
    }
	
}
