//realizar un programa que evalue una direccion de eamil sea correcto o no
//vamos a evaluar que el programa tenga un @ es valida y sino no es valida
//necesitaremos un meto charAt y length perteneciente a la clases String
//CharAt: Nos indica el caracte que estamos esecificando en el indice. O sea nos indica la posicion
//length:Nos indica la longitud-Porque necesitamos saber cuanto caracteres tiene, que longitud tiene un email.

import javax.swing.JOptionPane;
public class Programa_email {

	public static void main(String[] args) {
		
		boolean arroba= false; //creamos una variable de tipo boolean y la declaramos de tipo false
		
        String mail=JOptionPane.showInputDialog("introduzca su email");/*Creamos una variable de tipo String y utilizamos el metodo JOptionPane para introduzca el email en una  
		                                                                ventana*/
		
        
        for(int i=0; i<mail.length(); i++) { //i=0 crear una variable de tipo entero que inicia desde 0
        if(mail.charAt(i)=='@') {            //i<email.length() utilizamos el metodo length para decirle al programa que recorra el email sin ninguna restriciones de caracteres
        arroba=true;                                 // i++ introduzca de 1 en 1
        	                                  
        }
        }
        	                                 
        if(arroba==true) {
        	System.out.println("su email es correcto");
        }
        else {
        	System.out.print("El email no es correcto");
        }
        
        } 
        
        
        
	}


