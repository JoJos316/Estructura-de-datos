package MetodosOrdenamiento;
public interface IPila 
{
	boolean agregar(Nodo n);//push
	Nodo eliminar();		//pop
	boolean estaVacio();
	void mostrar();
}

