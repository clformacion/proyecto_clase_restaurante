

import javax.swing.*;
public class programa_clave {

	public static void main(String[] args) {
		String clave="carlos";
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("CLAVE");
			
			if(clave.equals(pass)==false) {
				System.out.println("contraseña incorrecta");
			}	
		}
		System.out.print("contraseña correcta");	
	}

}
