
public class Matriz {

	public static void main(String[] args) {
		
		/*int []mi_matriz=new int[5];//primera forma de realizar una matriz
		
		mi_matriz[0]=35;
		mi_matriz[1]=25;
		mi_matriz[2]=10;
		mi_matriz[3]=8;
		mi_matriz[4]=-15;*/

		
		//System.out.print(mi_matriz[5]);==>primera forma de imprimir una matriz por elemento
		
		//segunda forma de imprimir una matriz
		/*for(int i=0;i<5;i++) {
			
			System.out.println("el valor de :" + i + " " + "es:" + mi_matriz[i]);*/
		
		//TERCERA FORMA SI LA MATRIZ NO SABEMOS DONDE TERMINA UTILIZAMOS EL METODO length EL CUAL NOS INDICA LA ULTIMA POSICION DE LA MATRIZ
		
		int[]mi_matriz={25,32,14,18,85,66,21,87,51,25,78,1000,15458,2365,10};
		
	for(int i=0; i<mi_matriz.length;i++) {
		
		System.out.println("Su matriz de: " + (i) + " = "+ mi_matriz[i]);
		
		
		}
		
	
	}

}
