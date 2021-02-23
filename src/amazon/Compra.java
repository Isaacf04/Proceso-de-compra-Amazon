/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Compra {

	/**
	 * 
	 */
	public Compra() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Comprar Articulos");
		
		System.out.println("*****************************");
		
		Envio env1= new Envio("Prime", "$20", "Costa Rica");
		env1.enviar();
		env1.setPrecio("$10");
		System.out.println(env1.toString());
		
		System.out.println("*****************************");
		
		Tarjeta tarjeta1= new Tarjeta(1235555, "Roberto Perez", 6, 22, 989);
		tarjeta1.pago();
		tarjeta1.setCvv(999);
		System.out.println(tarjeta1.toString());
	}

}
