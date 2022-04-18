package controller;

import model.NPC;
import model.Personagem;

public abstract class Batalha {

	public void inicioBatalha(Personagem p) {
		System.out.println("Batalha iniciada com NPC n�vel "+p.getNivel());
	}
	
	public abstract NPC npcsBatalha(Personagem p);
	
}
