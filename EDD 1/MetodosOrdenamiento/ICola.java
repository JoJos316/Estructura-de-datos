package MetodosOrdenamiento;

public interface ICola 
{
	public boolean estaVacia();
	public boolean estaLlena();
	public boolean agregar(Nodo n);
	public Nodo eliminar(Object o);
	

	
	public void mostrar();
}