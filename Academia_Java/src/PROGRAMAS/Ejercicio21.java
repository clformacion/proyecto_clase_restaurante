
package PROGRAMAS;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.*;
public class Ejercicio21 {

	public static void main(String[] args) {
	JFrame ventana= new JFrame("primera ventana");

	
	
		
	SwingUtilities.invokeLater(new Runnable() {
		@Override
		public void run() {		
		}
	});	
	Container contenedor = ventana.getContentPane();
	//contenedor.add(new JButton ("BorderLayout.CENTER"),BorderLayout.CENTER);//
	contenedor.add(new JButton ("BorderLayout.NORTH"),BorderLayout.NORTH);
	contenedor.add(new JButton ("BorderLayout.SOUTH"),BorderLayout.SOUTH);
	contenedor.add(new JButton ("BorderLayout.EAST"),BorderLayout.EAST);
	contenedor.add(new JButton ("BorderLayout.WEST"),BorderLayout.WEST);
	ventana.setSize(300, 300);
	ventana.setVisible(true);
	
    JPanel panel =new JPanel();
    //panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));//=>TE COLOCA LOS BOTONES DEL LADO IZQUIERDO
    panel.add(new JButton ("Uno"));
    panel.add(new JButton ("Dos"));
    panel.add(new JButton ("Tres"));
    panel.add(new JButton ("Cuatro"));
    panel.add(new JButton ("Cinco"));
    panel.add(new JButton ("CONTROL"));
    contenedor.add(panel);
    
    ventana.setSize(200, 200);
    ventana.setVisible(true);
	
	
	
	
	
	
	}

	
}
