/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Articulos extends Electronicos {
	private String nombrearticulo;
	private double precio;
	private String descripcion;
	private double calificacion;
	
	//set - get


	/**
	 * @return the nombrearticulo
	 */
	public String getNombrearticulo() {
		return nombrearticulo;
	}

	/**
	 * @param nombrearticulo the nombrearticulo to set
	 */
	public void setNombrearticulo(String nombrearticulo) {
		this.nombrearticulo = nombrearticulo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}

	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	// metodo heredados
	@Override
	public String getTipocamara() {
		// TODO Auto-generated method stub
		return super.getTipocamara();
	}

	@Override
	public void setTipocamara(String tipocamara) {
		// TODO Auto-generated method stub
		super.setTipocamara(tipocamara);
	}

	@Override
	public String getTipofotografia() {
		// TODO Auto-generated method stub
		return super.getTipofotografia();
	}

	@Override
	public void setTipofotografia(String tipofotografia) {
		// TODO Auto-generated method stub
		super.setTipofotografia(tipofotografia);
	}

	@Override
	public String getTipovideo() {
		// TODO Auto-generated method stub
		return super.getTipovideo();
	}

	@Override
	public void setTipovideo(String tipovideo) {
		// TODO Auto-generated method stub
		super.setTipovideo(tipovideo);
	}

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
	public String getSubcategoria() {
		// TODO Auto-generated method stub
		return super.getSubcategoria();
	}

	@Override
	public void setSubcategoria(String subcategoria) {
		// TODO Auto-generated method stub
		super.setSubcategoria(subcategoria);
	}

	@Override
	public String getArticulos() {
		// TODO Auto-generated method stub
		return super.getArticulos();
	}

	@Override
	public void setArticulos(String articulos) {
		// TODO Auto-generated method stub
		super.setArticulos(articulos);
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
	public void metodobusqueda() {
		// TODO Auto-generated method stub
		super.metodobusqueda();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void comprarcategoria() {
		// TODO Auto-generated method stub
		super.comprarcategoria();
	}

	@Override
	public void masvendidos() {
		// TODO Auto-generated method stub
		super.masvendidos();
	}

	@Override
	public void aplicarfiltros() {
		// TODO Auto-generated method stub
		super.aplicarfiltros();
	}

	//metodos
	public void comprar() {
		System.out.println("Quieres comprar?");
	}
	public void preguntar() {
		System.out.println("Quieres preguntar?");
	}
	public void opinar() {
		System.out.println("Quieres opinar?");
	}

	//constructor
	/**
	 * @param nombre
	 * @param subcategoria
	 * @param articulos
	 * @param tipocamara
	 * @param tipofotografia
	 * @param tipovideo
	 * @param nombrearticulo
	 * @param precio
	 * @param descripcion
	 * @param calificacion
	 */
	public Articulos(String nombre, String subcategoria, String articulos, String tipocamara, String tipofotografia,
			String tipovideo, String nombrearticulo, double precio, String descripcion, double calificacion) {
		super(nombre, subcategoria, articulos, tipocamara, tipofotografia, tipovideo);
		this.nombrearticulo = nombrearticulo;
		this.precio = precio;
		this.descripcion = descripcion;
		this.calificacion = calificacion;
	}

	
	
	
	
}
