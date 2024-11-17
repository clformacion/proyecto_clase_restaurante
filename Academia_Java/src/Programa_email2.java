/*En el ejercicio email hemos un creado un programa que reconoce si hay un @ pero que pasa si existiera dos o mas @ ahi tenemos que aplicar otra funciones
 * 
 * 
 */

import javax.swing.JOptionPane;
public class Programa_email2 {

	public static void main(String[] args) {
		
		int arroba= 0;//declaramos un int=0 
		
		boolean punto=false; //cree una variable punto para el punto
		
        String mail=JOptionPane.showInputDialog("introduzca su email"); 
       
        for(int i=0; i<mail.length(); i++) { 
       
        if(mail.charAt(i)=='@') {            
       
        arroba++;//digo que incremente en 1+1                                 
        	                                  
        }
        if(mail.charAt(i)=='.') {  //hacemo lo mismo pero con el . punto por si alguien no coloca un punto en el email
        
        punto=true;	
        	
        	
        }
        
        
        
        }
        	                                 
        if(arroba==1 && punto==true) {// aqui le diria a que si fuera igual a 1 diera por cerrado el resultado. aqui tabien le resalte la variable punto
        	System.out.println("su email es correcto");
        }
        else {
        	System.out.print("El email no es correcto");
        }
        
        } 
        
        
        
	}


/*
 * Al cambiar el programa y decirle que tenemos arroba busque desde 0  en 1 en 1 hasta conseguir el arroba 
 * 
 */

