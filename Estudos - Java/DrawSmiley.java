/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: 26/NOV/2020
autor: Willian Santos 

*/
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley{

	public void paintComponent (Graphics g){

	super.paintComponent(g);

		//define cor do desenho. pode ser RGB
	g.setColor(Color.YELLOW);
	g.fillOval(10,10,200,200);

	g.setColor(Color.BLACK);
	g.fillOval(55,65,30,30);
	g.fillOval(135,65,30,30);
	
	g.fillOval(50,110,120,60);

	g.setColor(Color.YELLOW);
	g.fillRect(50,110,120,30);
	g.fillOval(50,120,120,40);
	}

}