import static java.lang.System.*;
/**
 * @author Carlos Solorzano, Jose Gerardo Molina, Marlon Hernandez
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		out.println("Expresion: " + "5 1 2 + 4 * + 3 -");
		out.println(calc.Calcular("5 1 2 + 4 * + 3 -"));
		//out.println(calc.Calcular("1 2 + 4 * 3 +"));
		out.println(calc.ToString());
	}
}
