package paquete1;

public class Test {

	public static void main(String[] args) {
		System.out.println(Operaciones.SUMA);
		System.out.println(Operaciones.RESTA.name());
		
		double a=2;
		double b=4;
		Operaciones ope=Operaciones.SUMA;
		double res=Operaciones.SUMA.resultado(a,b);
		System.out.println(res);
		System.out.println("Hola mundo");
		
		Operaciones ope[]=Operaciones.values();
		for(int i=0; i<ope.length;i++){
			System.out.println(ope[i].name());		}
	}

}

//MODO MENOS ELEGANTE
/*double res=0;
if(ope==Operaciones.SUMA){
	res= a+b;
} else if(ope==Operaciones.RESTA){
	res= a -b;
}*/
