
public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaracion de variables
		
		double valor=7.98765;
		double valor2=4.9999;
		int valor3=123;
		int valor4=321;
		
		
		//operaciones utilizando librerias
		
		//entrega la raiz cuadrada de valor
		double raiz=Math.sqrt(valor);
		System.out.println(raiz);
		
		//redondea valor
		double round=Math.round(valor);
		System.out.println(round);
		
		//entrega valor absoluto
		double abs=Math.abs(valor);
		System.out.println(abs);
		
		//muestra el mayor de dos valores double
		double max=Math.max(valor,valor2);
		System.out.println(max);
		
		//muestra el menor de dos valores int
		double min=Math.min(valor3,valor4);
		System.out.println(min);
		
		//muestra el primer numero elevado al segundo numero
		double pow=Math.pow(valor,valor2);
		System.out.println(pow);
		
		//muestra el signo del valor 
		double signum=Math.signum(valor2);
		System.out.println(signum);
		
		//muestra la raiz cubica del valor
		double cbrt=Math.cbrt(valor4);
		System.out.println(cbrt);
		
		//Devuelve el valor doble más cercano en valor al argumento y es igual a un entero matemático.
		double rint=Math.rint(valor2);
		System.out.print(rint);
		
		//devuelve el logaritmo en base 10 del valor
		double log10=Math.log10(valor4);
		System.out.println(log10);
		
		//seno de un angulo
		double sin=Math.sin(valor3);
		System.out.println(sin);		

	}

}
