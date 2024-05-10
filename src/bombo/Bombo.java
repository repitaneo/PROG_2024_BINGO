package bombo;

import java.util.HashSet;
import java.util.Set;

public class Bombo {
	
	private Set<Integer> bombo; 
	
	public Bombo() {

		bombo = new HashSet<Integer>();
		for(int i=1;i<=90;i++) {
			
			bombo.add(i);
		}
	}

	
	public boolean hasMore() {
		
		return !bombo.isEmpty();
	}
	
	
	
	
	public int next() {
		
		int numero = 0;
		while(bombo.contains(numero)==false) {
			
			numero = ((int)(Math.random()*90))+1;
		}
		bombo.remove(numero);
		
		return numero;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "\nSOY EN BOMBO[" + bombo + "]\\nFIN DEL BOMBO";
	}
	
	
	
	
	
	
	
}
