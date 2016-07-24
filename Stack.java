import java.util.Vector;

/**
 * @author Carlos Solorzano, Jose Gerardo Molina, Marlon Hernandez
 * @param <T> Tipo de la estructura
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
	public void Push(T element) {
		vector.add(0, element);
	}

	@Override
	public T Pop() {
		return IsEmpty() ? null : vector.remove(0);
	}

	@Override
	public T get() {
		return IsEmpty() ? null : vector.remove(0);
	}

	@Override
	public int Size() {
		return vector.size();
	}

	@Override
	public boolean IsEmpty() {
		return vector.isEmpty();
	}
}
