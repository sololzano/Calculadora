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
		out.println("Resultado: " + calc.Calcular(calc.LeerArchivo("datos.txt")));
		out.println(calc.ToString());
	}
}
