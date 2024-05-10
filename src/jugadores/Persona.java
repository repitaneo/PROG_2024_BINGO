package jugadores;

import java.util.ArrayList;
import java.util.List;

import bingo.Carton;

public class Persona {

	private String nombre;
	private List<Carton> cartones;

	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		cartones = new ArrayList<Carton>();
		
		int numeroCartones = ((int)(Math.random()*5))+1;
		for(int i=0;i<numeroCartones;i++) {
			cartones.add(new Carton());
		}
	}


	@Override
	public String toString() {
		return "\n[" + nombre + "\n" + cartones + "]\n>>>>>>>>>>>>>>>";
	}


	
	public void comprueba(int numero) {
		
		for(Carton c:cartones) {
			
			c.tachar(numero);
		}
	}


	public Carton eresGanador() {
		for(Carton c:cartones) {
			
			if(c.isGanador()) return c;
		}
		return null;
	}
	
	
	
	
	
	
}
