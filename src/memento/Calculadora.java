package memento;

public class Calculadora {
	Double resultado;
	public Calculadora() {
		this.resultado = 0.0;
				
	}
	public Double sumar (Double numeroUno, Double numeroDos) {
		this.resultado = numeroUno + numeroDos;
		return this.resultado;
	}

    public MementoCalculadora guardarResultado() 
    { 
        System.out.println("Originator: Saving to Memento.");
        return new MementoCalculadora(this.resultado); 
    }

    public void restaurarResultado(MementoCalculadora m) 
    {
        this.resultado = m.getResultadoGuardado(); 
        System.out.println("El resultado almacenado es: " + this.resultado.toString());
    }	
	
}
