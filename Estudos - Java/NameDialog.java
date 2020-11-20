/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: nov/2020
autor: Willian Santos */


import javax.swing.JOptionPane;
import java.util.Scanner;


public class NameDialog{

	public static void main(String[] args){

	String name = JOptionPane.showInputDialog("Qual o seu nome?");
	String message = String.format ("Bem vindo, %s a programacao em Java",name);

	JOptionPane.showMessageDialog(null,message);
	}
}