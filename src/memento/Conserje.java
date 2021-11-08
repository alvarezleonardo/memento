package memento;

import java.util.ArrayList;

public class Conserje {
	   private ArrayList<MementoCalculadora> resultados = new ArrayList<MementoCalculadora>();
	   
	   public void addMemento(MementoCalculadora m) 
	   { 
		   resultados.add(m); 
	   }
	   public MementoCalculadora getMemento(int index) 
	   { 
		   return resultados.get(index); 
	   }
	
	
}
