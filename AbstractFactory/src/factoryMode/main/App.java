package factoryMode.main;

import java.lang.reflect.InvocationTargetException;

import factoryMode.main.afm.criadorConcreto.AbstractCreator;
import factoryMode.main.afm.criadorConcreto.Cozinha;


public class App {
	
	public static AbstractCreator pedidoCombo;
	public static Cozinha cozinha;

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		pedido();
		processoPedido();
	}
	
	public static void pedido() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		pedidoCombo =(AbstractCreator) Class.forName("factoryMode.main.afm.criadorConcreto.ComboDoceLeiteChocolateJP").getConstructor().newInstance();
		cozinha = new Cozinha(pedidoCombo);
	}
	
	public static void processoPedido() {
		cozinha.preparando();
	}
}
