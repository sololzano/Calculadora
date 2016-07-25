import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Carlos Solorzano, Jose Gerardo Molina, Marlon Hernandez
 *
 */
public class Calculadora implements I_Calculadora {

	/**
	 * 
	 */
	private String pasos;;
	private Stack<Integer> stack;
	
	/**
	 * 
	 */
	public Calculadora() {
		pasos = "\r\n" + "Operaciones: " + "\r\n";
		stack = new Stack<Integer>();
	}

	@Override
	public int Calcular(String vector) {
		int n;
		int num1, num2;
		for (String sp : vector.split(" ")) {
			try {
				n = Integer.parseInt(sp);
				stack.Push(n);
				pasos += "Push operando: " + n + "\r\n";
			} catch (Exception e) {
				if (stack.Size() > 1) {
					num1 = stack.Pop();
					num2 = stack.Pop();
					if (sp.equals("+")) {
						pasos += "Sumar: " + num1 + " + " + num2 + "\r\n";
						pasos += "Resultado suma: " + (num1 + num2) + "\r\n";
						stack.Push(num1 + num2);
					}else if (sp.equals("-")) {
						stack.Push(num2 - num1);
						pasos += "Restar: " + num2 + " - " + num1 + "\r\n";
						pasos += "Resultado resta: " + (num2 - num1) + "\r\n";
					}else if (sp.equals("*")) {
						stack.Push(num1 * num2);
						pasos += "Multiplicar: " + num1 + " * " + num2 + "\r\n";
						pasos += "Resultado multiplicacion: " + (num1 * num2) + "\r\n";
					}else if (sp.equals("/")) {
						stack.Push(num1 / num2);
						pasos += "Dividir: " + num1 + " / " + num2 + "\r\n";
						pasos += "Resultado division: " + (num1 / num2) + "\r\n";
					}
				}
			}
		}	
		return stack.Pop();
	}

	/* (non-Javadoc)
	 * @see I_Calculadora#ToString()
	 */
	@Override
	public String ToString() {
		return pasos;
	}

	/* (non-Javadoc)
	 * @see I_Calculadora#LeerArchivo(java.lang.String)
	 */
	@Override
	public String LeerArchivo(String direccion) {
		String resultado = "";
		try {
			FileReader f = new FileReader(direccion);
			BufferedReader b = new BufferedReader(f);
			try {
				resultado = b.readLine();
				b.close();
			} catch (IOException e) {
				return "No se puede abrir archivo";
			}
		} catch (FileNotFoundException e) {
			return "Archivo no encontrado";
		}
		return resultado;
	}
}
