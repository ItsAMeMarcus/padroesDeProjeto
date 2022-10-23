package factoryMode.main.afm.produtos.milkshakes;

public class MilkShakeChocolateDoceLeite extends MilkShakeIngredientes implements MilkShake {

	@Override
	public void fazMilkShake() {
		setLeite("integral");
		setChocolate(true);
		setDoceDeLeite(true);
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
