package factoryMode.main.afm.produtos.milkshakes;

public class MilkShakeOvomaltine extends MilkShakeIngredientes implements MilkShake {

	@Override
	public void fazMilkShake() {
		setLeite("integral");
		setChocolate(true);
		setOvomaltine(true);
		entregaMilkShake();
	}

	@Override
	public void entregaMilkShake() {
		System.out.println("Acompanhado do seu MilkShake de Nutella com leite " + getLeite() + 
				", " + getNutella() + 
				", " + getChocolate() +
				", " + getOvomaltine() +
				" e " + getDoceDeLeite());
		
	}
	
}
