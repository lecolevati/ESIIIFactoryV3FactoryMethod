package controller;

import model.NPC;
import model.NPCNivelDois;
import model.Personagem;

public class BatalhaNivel2 extends Batalha {

	@Override
	public NPC npcsBatalha(Personagem p) {
		if (p.getNivel() == 2) {
			NPCNivelDois npc = new NPCNivelDois();
			int id = (int) ((Math.random() * 10001) + 10000);
			npc.setId(id);
			npc.setArma("Machado");
			npc.setEnergia(100);
			npc.setAutoCura(20);
			return npc;
		}
		return null;
	}

}
