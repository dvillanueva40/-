package ejemplo_ordenamiento;
import java.util.*;
public class burbuja_de_ordenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]burbuja=new int[6];
		int n = 0;
		for(int i=0;i<=n-1;i++){
			for(int j=0;j<=n-1;j++){
				
				if (burbuja[j]>burbuja[j+1]){
					int aux = burbuja[j];
					burbuja [j]=burbuja[j+1];
					burbuja [j+1]=aux;
					
				}
				
			}
		}
		
	}

}
