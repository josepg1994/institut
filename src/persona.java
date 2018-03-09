
public class persona {
	public String nombre;
	public int material;
	public int añonacim;
	//constructores
	public persona() {
		this("",0);
	}
	public persona(String nombre,int añonacim) {
	this.nombre = nombre;
	this.añonacim = añonacim;
	
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
	public int getAñonacim() {
		return añonacim;
	}
	public void setAñonacim(int añonacim) {
		this.añonacim = añonacim;
	}
	//metodo para calcular el descuento
	public  static double calcularDesc(int a,double b) {
		return (a*b);
	}
}
