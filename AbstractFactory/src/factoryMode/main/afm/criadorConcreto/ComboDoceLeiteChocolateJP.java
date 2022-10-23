package factoryMode.main.afm.criadorConcreto;
import factoryMode.main.afm.produtos.milkshakes.MilkShake;
import factoryMode.main.afm.produtos.milkshakes.MilkShakeChocolateDoceLeite;
import factoryMode.main.afm.produtos.sanduiches.Sanduiche;
import factoryMode.main.afm.produtos.sanduiches.SanduicheJP;

public class ComboDoceLeiteChocolateJP implements AbstractCreator{

	@Override
	public Sanduiche createSanduiche() {
		Sanduiche sanduiche = new SanduicheJP();
		return sanduiche;
	}

	@Override
	public MilkShake createMilkShake() {
		MilkShake milkshake = new MilkShakeChocolateDoceLeite();
		return milkshake;
	}

}
