package MetodosOrdenamiento;

public class mainnodo {
	public static void main(String []args)
	{
		Nodo n1= new Nodo("Primero");
		Nodo n2= new Nodo("segudno");
		Nodo n3= new Nodo("terverp");
		
		Cola cola = new Cola(5);
		cola.agregar(n1);
		cola.agregar(n2);
		cola.agregar(n3);
		
		cola.mostrar();
	}
}