import java.util.Vector;

/**
 * 
 */

/**
 * @author carlos
 * @param <T>
 *
 */
public class Stack<T> implements I_Stack<T> {

	private Vector<T> vector;
	
	/**
	 * Constructor vacío
	 */
	public Stack() {
		vector = new Vector<T>();
	}

	@Override
	public void push(T element) {
		vector.add(0, element);
	}

	@Override
	public T pop() {
		return isEmpty() ? null : vector.remove(0);
	}

	@Override
	public T get() {
		return isEmpty() ? null : vector.remove(0);
	}

	@Override
	public int size() {
		return vector.size();
	}

	@Override
	public boolean isEmpty() {
		return vector.isEmpty();
	}
}
