package factoryMode.main.afm.criadorConcreto;

import factoryMode.main.afm.produtos.milkshakes.MilkShake;
import factoryMode.main.afm.produtos.milkshakes.MilkShakeNutella;
import factoryMode.main.afm.produtos.sanduiches.Sanduiche;
import factoryMode.main.afm.produtos.sanduiches.SanduicheCG;

public class ComboNutellaCG implements AbstractCreator{

	@Override
	public Sanduiche createSanduiche() {
		Sanduiche sanduiche = new SanduicheCG();
		return sanduiche;
	}

	@Override
	public MilkShake createMilkShake() {
		MilkShake milkshake = new MilkShakeNutella();
		return milkshake;
	}

}
