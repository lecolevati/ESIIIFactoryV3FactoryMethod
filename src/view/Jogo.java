package view;

import controller.Batalha;
import controller.BatalhaNivel1;
import controller.BatalhaNivel2;
import controller.BatalhaNivel3;
import model.NPC;
import model.Personagem;

public class Jogo {

	public static void main(String[] args) {
		
		Personagem p = new Personagem();
		p.setId(1);
		p.setNome("Azkrevtz");
		p.setEnergia(100);
		p.setNivel(4);
		p.setArma("Espada");
		
		NPC npcBatalha = null;
		Batalha bat1 = new BatalhaNivel1();
		Batalha bat2 = new BatalhaNivel2();
		Batalha bat3 = new BatalhaNivel3();
		
		if (bat1.npcsBatalha(p) != null) {
			bat1.inicioBatalha(p);
			npcBatalha = bat1.npcsBatalha(p);
		}
		if (bat2.npcsBatalha(p) != null) {
			bat2.inicioBatalha(p);
			npcBatalha = bat2.npcsBatalha(p);
		}
		if (bat3.npcsBatalha(p) != null) {
			bat3.inicioBatalha(p);
			npcBatalha = bat3.npcsBatalha(p);
		}
		System.out.println(npcBatalha.toString());
	}
	
}
