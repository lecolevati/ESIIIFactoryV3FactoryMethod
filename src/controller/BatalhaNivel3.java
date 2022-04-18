package controller;

import model.NPC;
import model.NPCNivelTres;
import model.Personagem;

public class BatalhaNivel3 extends Batalha {

	@Override
	public NPC npcsBatalha(Personagem p) {
		if (p.getNivel() == 3) {
			NPCNivelTres npc = new NPCNivelTres();
			int id = (int) ((Math.random() * 100001) + 100000);
			npc.setId(id);
			npc.setArma("Adaga");
			npc.setEnergia(100);
			npc.setReplicacao(5);
			return npc;
		}
		return null;
	}

}
