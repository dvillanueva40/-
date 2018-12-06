
public class declararvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 4;
		int c=(a+b);
		
		System.out.println("la suma de a y b es "+c);
		
		double d= 0.345;
		double e= 4.444;
		double f= (d-e);
		double p=(a+b+c+d+e);
		double m=(a*b*c*d*e*f*p);
		
		System.out.println("la resta de d y e es "+f);
		System.out.println("el resultado de sumar a,b,c,d,e es "+p);
		System.out.println("si multiplicamos todas las anteriores el resultado es "+m);
		
		boolean r=true;
		boolean x=false;
		boolean z=(r!=x);
		boolean q=(r&&x);
		boolean w=(r||x);
		
		System.out.println(z);
		System.out.println(q);
		System.out.println(w);
		
		//ejemplos del profe
		
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a/b);
		System.out.println(b/a);
		System.out.println(d*b);
		System.out.println(a-p);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(c+=2);
		System.out.println(c);
		System.out.println(b-=4);
		System.out.println(b);
		
		String texto="FIN";
		System.out.println(texto);
		System.out.println("----");
		
		
	}

}
