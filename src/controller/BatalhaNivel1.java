package controller;

import model.NPC;
import model.NPCNivelUm;
import model.Personagem;

public class BatalhaNivel1 extends Batalha {

	@Override
	public NPC npcsBatalha(Personagem p) {
		if (p.getNivel() == 1) {
			NPCNivelUm	npc = new NPCNivelUm();
			int id = (int)((Math.random() * 1001) + 1000);
			npc.setId(id);
			npc.setArma("Espada");
			npc.setEnergia(100);
			npc.setMagia(10);
			return npc;
		}
		return null;
	}

}
