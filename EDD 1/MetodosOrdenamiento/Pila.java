package MetodosOrdenamiento;

public class Pila implements IPila
{
	Nodo inicio;
	Nodo ultimo;
	
	
	
	public Pila()
	{
		inicio = null;
		ultimo=null;
	}

	public boolean agregar(Nodo n) {
		return false;
	}

	public boolean estaVacio()
	{
		return ultimo== null;
	}
	public Nodo eliminar() {

		Nodo temp = ultimo;
		if(!estaVacio())
		{

			if(ultimo == inicio)
			{
				ultimo = inicio = null;
				return temp;
			}
			
			Nodo actual = inicio;
			while(actual.getSiguiente() !=ultimo)
			{
				actual=actual.getSiguiente();
			}
			ultimo = actual;

			ultimo.setSiguiente(null);
		}
		return temp;
	}

	public void mostrar() {
		
	}
	
}
