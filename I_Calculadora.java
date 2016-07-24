/**
 * @author Carlos Solorzano, Jose Gerardo Molina, Marlon Hernandez
 *
 */
public interface I_Calculadora {
	
	/**
	 * 
	 * @param vector La cadena de caracteres en formato POSFIX
	 * @return El resultado del calculo
	 */
	public String Calcular (String vector);

	/**
	 * 
	 * @return Los pasos de la calculadora
	 */
	public String ToString();
	
	/**
	 * 
	 * @param direccion La ruta del archivo de texto
	 * @return La primera linea del archivo de texto
	 */
	public String LeerArchivo (String direccion);
}
