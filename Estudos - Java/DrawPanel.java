/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: nov/2020
autor: Willian Santos */



import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	public void paintComponent (Graphics g){
	
	super.paintComponent(g);
	
	int width = getWidth();
	int height = getHeight();

	g.drawLine(0,0,width,height);
	g.drawLine(0,height,width, 0);

	}

}