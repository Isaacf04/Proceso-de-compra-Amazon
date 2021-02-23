/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Busqueda {

	/**
	 * 
	 */
	public Busqueda() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Busqueda Articulos");
		
		System.out.println("*****************************");
		
		Departamento dep1= new Departamento("Electronicos", "Camara,Fotografia,Video", "Canon SJF");
		dep1.metodobusqueda();
		dep1.iniciarsesion();
		dep1.setArticulos("Polaroid");
		System.out.println(dep1.toString());
		
		System.out.println("*****************************");
		
		Electronicos elect1= new Electronicos("Electronicos", "Camara,Fotografia,Video", "Canon SJF", "Manual", "1800", "4k");
		elect1.masvendidos();
		elect1.aplicarfiltros();
		elect1.comprarcategoria();
		elect1.setTipocamara("Digital");
		System.out.println(elect1.toString());
		
		System.out.println("*****************************");
		
		Articulos arti1= new Articulos("Electronicos", "Camara,Fotografia,Video", "Canon SJF", "Manual", "1800", "4k","Canon", 200, "Camara agua", 5);
		arti1.comprar();
		arti1.opinar();
		arti1.preguntar();
		arti1.setPrecio(250);
		System.out.println(arti1.toString());
	}

}
