/**
 * 
 */
package amazon;

/**
 * @author rebe2
 *
 */
public class Electronicos extends Departamento {
	
	private String tipocamara;
	private String tipofotografia;
	private String tipovideo;
	
	//set-get

	/**
	 * @return the tipocamara
	 */
	public String getTipocamara() {
		return tipocamara;
	}

	/**
	 * @param tipocamara the tipocamara to set
	 */
	public void setTipocamara(String tipocamara) {
		this.tipocamara = tipocamara;
	}

	/**
	 * @return the tipofotografia
	 */
	public String getTipofotografia() {
		return tipofotografia;
	}

	/**
	 * @param tipofotografia the tipofotografia to set
	 */
	public void setTipofotografia(String tipofotografia) {
		this.tipofotografia = tipofotografia;
	}

	/**
	 * @return the tipovideo
	 */
	public String getTipovideo() {
		return tipovideo;
	}

	/**
	 * @param tipovideo the tipovideo to set
	 */
	public void setTipovideo(String tipovideo) {
		this.tipovideo = tipovideo;
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

	
	//metodos
	
	public void comprarcategoria() {
		System.out.println("Esta es la categoria");
	}
	public void masvendidos() {
		System.out.println("Estos son los mas vendidos");
	}
	public void aplicarfiltros() {
		System.out.println("Quieres filtrar?");
	}
	//constructor
	/**
	 * @param nombre
	 * @param subcategoria
	 * @param articulos
	 * @param tipocamara
	 * @param tipofotografia
	 * @param tipovideo
	 */
	public Electronicos(String nombre, String subcategoria, String articulos, String tipocamara, String tipofotografia,
			String tipovideo) {
		super(nombre, subcategoria, articulos);
		this.tipocamara = tipocamara;
		this.tipofotografia = tipofotografia;
		this.tipovideo = tipovideo;
	}

	

}
