package factoryMode.main.fm.criadorConcreto;

import factoryMode.main.fm.produtos.Sanduiche;
import factoryMode.main.fm.produtos.SanduicheCG;

public class ChapeiroSanduicheCG extends SanduicheModoPreparo{

	@Override
	public Sanduiche novoSanduiche() {
		return new SanduicheCG();
	}

}
