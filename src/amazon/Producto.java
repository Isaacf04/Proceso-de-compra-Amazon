/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Producto implements Usuario {

	private String nombre;
	private String fabricante;
	private String nombremarca;
	private int idproducto;
	
	//set get
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * @return the nombremarca
	 */
	public String getNombremarca() {
		return nombremarca;
	}

	/**
	 * @param nombremarca the nombremarca to set
	 */
	public void setNombremarca(String nombremarca) {
		this.nombremarca = nombremarca;
	}

	/**
	 * @return the idproducto
	 */
	public int getIdproducto() {
		return idproducto;
	}

	/**
	 * @param idproducto the idproducto to set
	 */
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	//metodos interfaz 
	@Override
	public void iniciarsesion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void proveerdatos() {
		// TODO Auto-generated method stub
		
	}

	//metodos
	public void guardarproducto(){
		System.out.println("Estas guardando este producto");
	}

	//constructor
	/**
	 * @param nombre
	 * @param fabricante
	 * @param nombremarca
	 * @param idproducto
	 */
	public Producto(String nombre, String fabricante, String nombremarca, int idproducto) {
		super();
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.nombremarca = nombremarca;
		this.idproducto = idproducto;
	}

	@Override
	public String toString() {
		return " Las caracteristicas del Producto son:" + " "+ "nombre=" + " "+ nombre + " "+ "fabricante=" +" "+ fabricante + " "+"nombremarca=" + " "+nombremarca
				+ " "+ "idproducto=" + " "+ idproducto;
	}
	
	
}
