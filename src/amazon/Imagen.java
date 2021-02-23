/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Imagen {
 
	private int pixeles;
	private String formato;
	
	// set - get
	/**
	 * @return the pixeles
	 */
	public int getPixeles() {
		return pixeles;
	}
	/**
	 * @param pixeles the pixeles to set
	 */
	public void setPixeles(int pixeles) {
		this.pixeles = pixeles;
	}
	/**
	 * @return the formato
	 */
	public String getFormato() {
		return formato;
	}
	/**
	 * @param formato the formato to set
	 */
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	//metodos
	public void agregarimagen(){
		System.out.println("Estas agregando una imagen");
	}
	
	//constructor
	/**
	 * @param pixeles
	 * @param formato
	 */
	public Imagen(int pixeles, String formato) {
		super();
		this.pixeles = pixeles;
		this.formato = formato;
	}
	@Override
	public String toString() {
		return "Las caracteristicas de la Imagen son"+" "+ "pixeles=" +" "+ pixeles +" "+ "formato=" +" "+ formato;
	}
	

	
}
