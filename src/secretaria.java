
public class secretaria {

	public static void main(String[] args) {
	profesor p1 = new profesor("Juan Dominguez",1970,1200);
	alumno a1 = new alumno("Yoel PLasencia",1999,"digital transformer");
	a1.setMaterial(200);
	p1.setMaterial(300);
	System.out.print(p1.toString());
	System.out.print(a1.toString());
	}

}
