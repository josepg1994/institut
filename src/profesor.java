
public class profesor extends persona {
	private int salario;
    //constructores
	public profesor(String nombre, int a�onacim,int salario) {
		super(nombre,a�onacim);
		this.salario=salario;
	}
	//metodos get y set
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	//heredamos el metodo calculardesc para calcular el descuento
	public double calculaprof() {
		 return super.calcularDesc(getMaterial(), 0.2);
	}
	@Override
	//restamos en el metodo tostring a material el resultado del descuento;
	public String toString() {
		return "profesor: "+nombre+" fecha nacimiento: "+a�onacim+" salario: "+salario+" material: "+(material-calculaprof())+" \n ";
	}
}
