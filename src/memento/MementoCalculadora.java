package memento;

public class MementoCalculadora {
    private Double resultado;
    
    public MementoCalculadora(Double guardarResultado)
    {
    	this.resultado = guardarResultado; 
    }

    public Double getResultadoGuardado()
    {
        return resultado; 
    }
}
