/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class AgregarArticulo {

	/**
	 * 
	 */
	public AgregarArticulo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Agregar Articulos");
		
		System.out.println("*****************************");
		
		Producto prod1= new Producto("Canon PowerShot SX540", "Canon", "Canone", 125);
		prod1.guardarproducto();
		prod1.setIdproducto(652);
		System.out.println(prod1.toString());
		
		System.out.println("*****************************");
		
		Clasificacion clasi1= new Clasificacion("Canon PowerShot SX540", "Canon", "Canone", 125, "Electronicos", "Camara,Fotografia,Video");
		clasi1.clasificar();
		clasi1.setFabricante("Samsung");
		System.out.println(clasi1.toString());
		
		System.out.println("*****************************");
		
		Imagen imagen1= new Imagen(1800, "jpg");
		imagen1.agregarimagen();
		imagen1.setPixeles(600);
		System.out.println(imagen1.toString());
	}

	
}
