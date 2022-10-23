package factoryMode.main.afm.criadorConcreto;

import factoryMode.main.afm.produtos.milkshakes.MilkShake;
import factoryMode.main.afm.produtos.sanduiches.Sanduiche;

public interface AbstractCreator {
	Sanduiche createSanduiche();
	MilkShake createMilkShake();
}