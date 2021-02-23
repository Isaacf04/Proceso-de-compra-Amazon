/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Clasificacion extends Producto {

	private String categoria;
	private String subcategoria;
	

	// set -get
	
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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

	// metodos heredados
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public String getFabricante() {
		// TODO Auto-generated method stub
		return super.getFabricante();
	}

	@Override
	public void setFabricante(String fabricante) {
		// TODO Auto-generated method stub
		super.setFabricante(fabricante);
	}

	@Override
	public String getNombremarca() {
		// TODO Auto-generated method stub
		return super.getNombremarca();
	}

	@Override
	public void setNombremarca(String nombremarca) {
		// TODO Auto-generated method stub
		super.setNombremarca(nombremarca);
	}

	@Override
	public int getIdproducto() {
		// TODO Auto-generated method stub
		return super.getIdproducto();
	}

	@Override
	public void setIdproducto(int idproducto) {
		// TODO Auto-generated method stub
		super.setIdproducto(idproducto);
	}

	@Override
	public void iniciarsesion() {
		// TODO Auto-generated method stub
		super.iniciarsesion();
	}

	@Override
	public void proveerdatos() {
		// TODO Auto-generated method stub
		super.proveerdatos();
	}

	@Override
	public void guardarproducto() {
		// TODO Auto-generated method stub
		super.guardarproducto();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	// metodos
	public void clasificar(){
		System.out.println("Estas clasificando este producto");
	}

	//constructor
	/**
	 * @param nombre
	 * @param fabricante
	 * @param nombremarca
	 * @param idproducto
	 * @param categoria
	 * @param subcategoria
	 */
	public Clasificacion(String nombre, String fabricante, String nombremarca, int idproducto, String categoria,
			String subcategoria) {
		super(nombre, fabricante, nombremarca, idproducto);
		this.categoria = categoria;
		this.subcategoria = subcategoria;
	}

	
}
