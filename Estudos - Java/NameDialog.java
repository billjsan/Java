import javax.swing.JOptionPane;
import java.util.Scanner;


public class NameDialog{

	public static void main(String[] args){

	String name = JOptionPane.showInputDialog("Qual o seu nome?");
	String message = String.format ("Bem vindo, %s a programacao em Java",name);

	JOptionPane.showMessageDialog(null,message);
	}
}