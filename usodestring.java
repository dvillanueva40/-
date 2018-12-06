package strings;

public class usodestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear 15 ejemplos de string
		
		String nombre1=new String ("palabras");
		String nombre2=new String ("azul");
		String nombre3="manejo";
		String nombre4="INSTRUCTOR";
		
		// 01.-Devuelve el valor char en el índice especificado, parte de cero.
		System.out.println("1.- "+nombre2.charAt (3));
		
		// 02.-Devuelve verdadero si y solo si esta cadena contiene la secuencia especificada de valores char.
		System.out.println("2.- "+nombre1.contains("pre"));
		
		// 03.-Comprueba si esta cadena termina con el sufijo especificado
		System.out.println("3.- "+nombre2.endsWith("r"));
		
		// 04.-Compara una cadena de caracteres con otra, devuelve boolean
		System.out.println("4.- "+nombre3.equals(nombre1));
		
		//05.-Devuelve la longitud de esta cadena.
		System.out.println("5.- "+nombre1.length());
		
		// 06.-Convierte todos los caracteres de esta cadena a minúsculas utilizando las reglas de la configuración regional predeterminada.
		System.out.println("6.- "+nombre4.toLowerCase());
		
		// 07.-Convierte todos los caracteres en esta cadena a mayúsculas 
		System.out.println("7.- "+nombre2.toUpperCase());
		
		// 08.-Devuelve una copia de la cadena, con espacios en blanco iniciales y finales omitidos.
		System.out.println("8.- "+nombre4+nombre3+nombre2+nombre1.trim());
		
		// 09.-
		
		
	}
}
	
		
