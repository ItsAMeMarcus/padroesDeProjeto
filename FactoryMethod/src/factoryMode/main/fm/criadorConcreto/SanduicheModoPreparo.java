package factoryMode.main.fm.criadorConcreto;

import factoryMode.main.fm.produtos.Sanduiche;
import factoryMode.main.fm.produtos.SanduicheIngredientes;

public abstract class SanduicheModoPreparo extends SanduicheIngredientes{
	public void preparaSanduiche() {
		Sanduiche sanduiche = novoSanduiche();
		sanduiche.fazSanduiche();
	}
	
	public abstract Sanduiche novoSanduiche();
}
