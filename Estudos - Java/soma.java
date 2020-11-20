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

public class soma{

	public static void main(String[] args ){
	Scanner input = new Scanner (System.in);

	int num1;
	int num2;
	int sum;


	String Value = JOptionPane.showInputDialog("digite primeiro inteiro"); 
	num1 = Integer.parseInt(Value);

	Value = JOptionPane.showInputDialog("digite segundo inteiro"); 
	num2 = Integer.parseInt(Value);

	sum = num1 + num2;
	
	String message = String.format("A soma de %d + %d = %d",num1,num2,sum);

	JOptionPane.showMessageDialog (null,message);

	}

}