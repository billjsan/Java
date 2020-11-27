/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: 26/NOV/2020
autor: Willian Santos 

*/

import javax.swing.JFrame;

public class TesteDrawSmiley{

	public static void main(String[] args){
	
	DrawSmiley painel = new DrawSmiley();
	JFrame meuFrame = new JFrame();


	meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	meuFrame.add(painel);
	meuFrame.setSize(230,250);
	meuFrame.setVisible(true);
	}

}