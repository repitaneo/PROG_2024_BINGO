package bingo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bombo.Bombo;
import jugadores.Persona;

public class Bingo {

	private Bombo bombo;
	private List<Persona> jugadores;
	
	
	public Bingo() {
		
		bombo = new Bombo();
		jugadores = new ArrayList<Persona>();
	}

	
	public void addJugador(Persona p) {
		
		jugadores.add(p);
	}
	
	
	public HashMap<Persona,Bombo> play() {
		
		HashMap<Persona,Bombo> resultado = new HashMap<Persona,Bombo>();
		while(bombo.hasMore()) {
		
			int numero = bombo.next();
			// tachar
			for(Persona p: jugadores) {
				
				p.comprueba(numero);
			}
			// preguntar si ganaron
			for(Persona p: jugadores) {
				
				Carton c = p.eresGanador();
				if(c!=null) {
					
					resultado.put(p, bombo);
					
					System.out.println(jugadores);
					
					return resultado;
				}
			}
		}
		return null;
		
	}
	
	
	
}
