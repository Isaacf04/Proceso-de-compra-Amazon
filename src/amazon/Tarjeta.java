/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Tarjeta {

	private int numero;
	private String nombre;
	private int mes;
	private int año;
	private int cvv;
	
	//set - get
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
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
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the año
	 */
	public int getAño() {
		return año;
	}
	/**
	 * @param año the año to set
	 */
	public void setAño(int año) {
		this.año = año;
	}
	/**
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	//metodo
	public void pago(){
		System.out.println("Estas pagando");
	}
	

	//constructor
	/**
	 * @param numero
	 * @param nombre
	 * @param mes
	 * @param año
	 * @param cvv
	 */
	public Tarjeta(int numero, String nombre, int mes, int año, int cvv) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.mes = mes;
		this.año = año;
		this.cvv = cvv;
	}
	
	@Override
	public String toString() {
		return " Info Tarjeta:"+" "+ "numero=" +" "+  numero + " "+ "nombre=" +" "+  nombre +" "+  "mes=" +" "+  mes + " "+ "año=" +" "+ año + " "+ "cvv=" +" "+  cvv;
	}
	

}
