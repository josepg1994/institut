
public class alumno extends persona {
	private String curso;
	//constructores
	public alumno(String nombre, int a�onacim,String curso) {
		super(nombre,a�onacim);
		this.curso = curso;
	}
	//metodos get y set
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	//heredamos el metodo calculardesc para calcular el descuento;
	public double calculalum() {
		 return super.calcularDesc(getMaterial(), 0.10); 
	}
	//restamos en el metodo tostring a material el resultado del descuento;
	public String toString() {
		return "alumno: "+nombre+" fecha nacimiento: "+a�onacim+" curso: "+curso+" material: "+(material-calculalum())+" \n ";
	}
}
