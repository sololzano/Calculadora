/**
 * 
 * @author Carlos Solorzano, Jose Gerardo Molina, Marlon Hernandez
 *
 * @param <T> Tipo de la estructura
 */
public interface I_Stack <T>{
	
	/**
	 * 
	 * @param element Elemento a guardar en la pila
	 */
	public void Push (T element);
	
	/**
	 * 
	 * @return El primer elemento de la pila
	 */
	public T Pop();
	
	/**
	 * 
	 * @return El primer elemento de la pila
	 */
	public T get();
	
	/**
	 * 
	 * @return La cantidad de elementos de la pila
	 */
	public int Size();
	
	/**
	 * 
	 * @return True si la pila está vacía
	 */
	public boolean IsEmpty();
}
