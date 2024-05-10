package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bingo.Bingo;
import bombo.Bombo;
import jugadores.Persona;

public class Start {

	public static void main(String[] args) {

		Bingo bingo = new Bingo();
		
		bingo.addJugador(new Persona("Ana"));
		bingo.addJugador(new Persona("Marcos"));
		bingo.addJugador(new Persona("Pedro"));
		
		bingo.play();
		
		


		
		
	}

}
