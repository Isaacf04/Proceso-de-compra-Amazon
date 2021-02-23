/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Departamento implements Usuario {
	
	private String nombre;
	private String subcategoria;
	private String articulos;
	
	//set - get
	
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
	 * @return the subcategoria
	 */
	public String getSubcategoria() {
		return subcategoria;
	}

	/**
	 * @param subcategoria the subcategoria to set
	 */
	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

	/**
	 * @return the articulos
	 */
	public String getArticulos() {
		return articulos;
	}

	/**
	 * @param articulos the articulos to set
	 */
	public void setArticulos(String articulos) {
		this.articulos = articulos;
	}

	// metodos interfaz
	@Override
	public void iniciarsesion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void proveerdatos() {
		// TODO Auto-generated method stub
		
	}
	
	//metodos 
	public void metodobusqueda() {
		System.out.println("Este es el articulo que buscas?");
	}

	//constructor
	/**
	 * @param nombre
	 * @param subcategoria
	 * @param articulos
	 */
	public Departamento(String nombre, String subcategoria, String articulos) {
		this.nombre = nombre;
		this.subcategoria = subcategoria;
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return " El departamento es:"+ " "+ "nombre=" + " "+ nombre + " "+  "subcategoria=" + " "+ subcategoria + " "+ "articulos=" + " "+ articulos;
	}
	

	
}
