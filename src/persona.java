
public class persona {
	public String nombre;
	public int material;
	public int a�onacim;
	//constructores
	public persona() {
		this("",0);
	}
	public persona(String nombre,int a�onacim) {
	this.nombre = nombre;
	this.a�onacim = a�onacim;
	
	}
	//metodos get y set
	public int getMaterial() {
		return material;
	}
	public void setMaterial(int material) {
		this.material = material;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getA�onacim() {
		return a�onacim;
	}
	public void setA�onacim(int a�onacim) {
		this.a�onacim = a�onacim;
	}
	//metodo para calcular el descuento
	public  static double calcularDesc(int a,double b) {
		return (a*b);
	}
}
