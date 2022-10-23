package factoryMode.main.afm.produtos.sanduiches;

public class SanduicheCG extends SanduicheIngredientes implements Sanduiche {

	@Override
	public void fazSanduiche() {
		System.out.println("Estamos fazendo seu sanduiche CG");
		setPao("integral");
		setPresunto("de frango");
		setQueijo("prato");
		setSalada(false);
		entregaSanduiche();
	}

	@Override
	public void entregaSanduiche() {
		System.out.println("Aqui está o seu Sanduiche CG com pão " + getPao() + 
				", presunto " + getPresunto() + 
				", queijo " + getQueijo() + 
				" e salada " + getSalada());
	}
}
