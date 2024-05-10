package bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Carton {

	private Set<Integer> numerosTachables;
	private List<Integer> numerosCarton;
		
	
	
	public Carton() {
		
		numerosTachables = new HashSet<Integer>();
		numerosCarton = new ArrayList<Integer>();
		
		for(int decena=0;decena<9;decena++) {
			
			int numero = ((int)(Math.random()*10))+1+decena*10;
			numerosTachables.add(numero);
			numerosCarton.add(numero);
			
			numero = ((int)(Math.random()*10))+1+decena*10;
			while(numerosTachables.contains(numero)) {
				
				numero = ((int)(Math.random()*10))+1+decena*10;
			}
			numerosTachables.add(numero);
			numerosCarton.add(numero);
		}
		Collections.sort(numerosCarton);
	}
	
	
	public void tachar(int numero) {
		
		numerosTachables.remove(numero);
	}
	
	
	public boolean isGanador() {
		
		return numerosTachables.isEmpty();
	}


	@Override
	public String toString() {
		return "\nCarton [\n" + numerosTachables + "\n" + numerosCarton + "]";
	}
	
	
	
}
