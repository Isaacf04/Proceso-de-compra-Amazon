/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public interface Usuario {

	public static final String nombre = "Roberto Jimenez";
	public static  String direccion = "Nubes, Coronado";
	public static int telefono = 89546542;
	public static  String email = "amazon@gmail.com";
	public static  String contraseña = "12345hola*";
	
	abstract void iniciarsesion();
	abstract void proveerdatos();

	}
