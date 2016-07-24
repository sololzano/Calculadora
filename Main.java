import static java.lang.System.*;

/**
 * 
 */

/**
 * @author Carlos Solorzano, Jose Gerardo Molina, Marlon Hernandez
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(15);
		out.println("Size: " + stack.size());
		out.println("Pushing 15");
		stack.push(20);
		out.println("Pushing 20");
		out.println(stack.pop());
		stack.push(25);
		out.println("Size: " + stack.size());
		out.println(stack.isEmpty());
		out.println(stack.pop());
		out.println(stack.pop());
		out.println(stack.isEmpty());
		out.println("Size: " + stack.size());
	}
}
