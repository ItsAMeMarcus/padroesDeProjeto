package factoryMode.main.afm.criadorConcreto;

import factoryMode.main.afm.produtos.milkshakes.MilkShake;
import factoryMode.main.afm.produtos.sanduiches.Sanduiche;

public class Cozinha {
	private Sanduiche sanduiche;
	private MilkShake milkshake;
	
	public Cozinha(AbstractCreator combo) {
		sanduiche = combo.createSanduiche();
		milkshake = combo.createMilkShake();
	}
	
	public void preparando() {
		sanduiche.fazSanduiche();
		milkshake.fazMilkShake();
	}
}
