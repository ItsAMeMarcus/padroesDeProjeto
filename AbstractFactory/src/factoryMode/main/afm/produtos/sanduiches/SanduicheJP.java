package factoryMode.main.afm.produtos.sanduiches;

public class SanduicheJP extends SanduicheIngredientes implements Sanduiche{

	@Override
	public void fazSanduiche() {
		System.out.println("Estamos fazendo seu sanduiche JP");
		setPao("francês");
		setPresunto("de frango");
		setQueijo("mussarela");
		setSalada(true);
		entregaSanduiche();
	}

	@Override
	public void entregaSanduiche() {
		System.out.println("Aqui está o seu Sanduiche JP com pão " + getPao() + 
				", presunto " + getPresunto() + 
				", queijo " + getQueijo() + 
				" e salada " + getSalada());
	}

}
