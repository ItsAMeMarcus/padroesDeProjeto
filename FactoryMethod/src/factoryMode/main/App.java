package factoryMode.main;

import java.lang.reflect.InvocationTargetException;

import factoryMode.main.fm.criadorConcreto.SanduicheModoPreparo;


public class App {
	
	public static SanduicheModoPreparo modoPreparo;

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		pedido();
		processoPedido();
	}
	
	public static void pedido() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		modoPreparo =(SanduicheModoPreparo) Class.forName("factoryMode.main.afm.criadorConcreto.ChapeiroSanduicheJP").getConstructor().newInstance();;
	}
	
	public static void processoPedido() {
		modoPreparo.preparaSanduiche();
	}
}
