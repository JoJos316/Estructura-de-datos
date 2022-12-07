package MetodosOrdenamiento;
public class Cola implements ICola{
	private Nodo inicio;
	private Nodo fin;
	private int tama�oActual;
	private int tama�oMaximo;
	
	public Cola(int tama�oMaximo){
		this.tama�oMaximo = tama�oMaximo;
		tama�oActual=0;
		inicio=null;
		fin=null;
	}
	
	public boolean estaVacia()
	{
		return tama�oActual==0;
	}
	
	public boolean estaLlena()
	{
		return tama�oActual == tama�oMaximo;
	}
	
	public boolean agregar(Nodo n)
	{
		if(!estaLlena())
		{
			if(fin !=null)
			{
				fin.setSiguiente(n);
				fin=fin.getSiguiente();
			}
			else
			{
				inicio = n;
				fin = n;
			}
			tama�oActual++;
			return true;
		}
			return false;
	}
	
	public void mostrar()
	{
		Nodo nodo = inicio;
		int contador = 0;
		while(nodo != null)
		{
			System.out.println("Nodo : "+ ++contador);
			System.out.println(nodo.getDato());
			nodo = nodo.getSiguiente();
		}
	}

	@Override
	public Nodo eliminar(Object o) {
		// TODO Auto-generated method stub
		return null;
	}
}
