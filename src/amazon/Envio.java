/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Envio implements Usuario {
	
	private String tipo;
	private String precio;
	private String pais;
	
	//set - get

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the precio
	 */
	public String getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	//metodos
	public void enviar() {
		System.out.println("Cual tipo de envio quieres?");
	}

	//constructor
	/**
	 * @param tipo
	 * @param precio
	 * @param pais
	 */
	public Envio(String tipo, String precio, String pais) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "El Envio es:"+ " "+ "tipo=" + " "+ tipo + " "+ "precio=" + " "+ precio + " "+  "pais=" + " "+  pais;
	}

	@Override
	public void iniciarsesion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void proveerdatos() {
		// TODO Auto-generated method stub
		
	}


}
