import java.io.*;

/**
 * 
 */
public class Calculadora implements I_Calculadora {

    /**
     * 
     */

    public Calculadora() {
    }

    public String LeerArchivo(String direccion)
    {
		//NOMBRE DEL ARCHIVO
		String nombreArchivo="file.txt";
		try{

		   FileReader archivo = new FileReader(nombreArchivo);
		   BufferedReader bufferReader = new BufferedReader(archivo);
		   bufferReader.close();
		}
		catch(Exception e)
			{
			  System.out.println("Error al leer el archivo:" + e.getMessage());                      
			}
    }

    /**
     * 
     */
    public void Calculadora() {
        // TODO implement here
    }

}
