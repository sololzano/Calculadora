/**
 * 
 * @author
 *
 * @param <T>
 */
public interface Pila <T>{
	
	/**
	 * 
	 * @param element
	 */
	public void push (T element);
	
	/**
	 * 
	 * @return
	 */
	public T pop();
	
	/**
	 * 
	 * @return
	 */
	public T get();
	
	/**
	 * 
	 * @return
	 */
	public int size();
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
}
