package factoryMode.main.fm.criadorConcreto;

import factoryMode.main.fm.produtos.Sanduiche;
import factoryMode.main.fm.produtos.SanduicheJP;

public class ChapeiroSanduicheJP extends SanduicheModoPreparo{

	@Override
	public Sanduiche novoSanduiche() {
		return new SanduicheJP();
	}

}
