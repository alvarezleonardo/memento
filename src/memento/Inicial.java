package memento;

public class Inicial {

	public static void main(String[] args) {

		Conserje conserje = new Conserje();
		
		Calculadora originador = new Calculadora();
		originador.sumar(2.0, 3.2);
		conserje.addMemento(originador.guardarResultado());
		originador.sumar(3.0, 6.0);
		conserje.addMemento(originador.guardarResultado());
		originador.sumar(5.0, 4.2);
		conserje.addMemento(originador.guardarResultado());
		
		
		originador.restaurarResultado(conserje.getMemento(1));
		originador.restaurarResultado(conserje.getMemento(0));
		originador.restaurarResultado(conserje.getMemento(2));
		
	}

}
