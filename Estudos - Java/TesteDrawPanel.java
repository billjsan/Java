/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: nov/2020
autor: Willian Santos */



import javax.swing.JFrame;


public class TesteDrawPanel {

	public static void main (String[] args){
	
	DrawPanel painel = new DrawPanel();

	JFrame application = new JFrame();

	application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	application.add(painel);
	application.setSize(1200,500);
	application.setVisible(true);
	}

}