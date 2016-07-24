/**
 * 
 * @author
 *
 * @param <T>
 */
public interface I_Stack <T>{
	
	/**
	 * 
	 * @param element Elemento a guardar en la pila
	 */
	public void push (T element);
	
	/**
	 * 
	 * @return El primer elemento de la pila
	 */
	public T pop();
	
	/**
	 * 
	 * @return El primer elemento de la pila
	 */
	public T get();
	
	/**
	 * 
	 * @return La cantidad de elementos de la pila
	 */
	public int size();
	
	/**
	 * 
	 * @return True si la pila está vacía
	 */
	public boolean isEmpty();
}
