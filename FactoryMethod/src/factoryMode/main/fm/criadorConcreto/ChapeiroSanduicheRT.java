package factoryMode.main.fm.criadorConcreto;

import factoryMode.main.fm.produtos.Sanduiche;
import factoryMode.main.fm.produtos.SanduicheRT;

public class ChapeiroSanduicheRT extends SanduicheModoPreparo{

	@Override
	public Sanduiche novoSanduiche() {
		return new SanduicheRT();
	}

}
