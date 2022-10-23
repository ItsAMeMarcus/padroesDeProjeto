package factoryMode.main.fm.produtos;

public class SanduicheRT extends SanduicheIngredientes implements Sanduiche {

	@Override
	public void fazSanduiche() {
		System.out.println("Estamos fazendo seu sanduiche RT");
		setPao("bola");
		setPresunto("de peru");
		setQueijo("cheddar");
		setSalada(false);
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
