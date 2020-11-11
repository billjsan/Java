import java.util.Scanner;

public class TesteGradeBook{


	public static void main(String[] args){

	GradeBook meuGradeBook = new GradeBook(); //cria objeto e associa 
	Scanner entrada = new Scanner (System.in);

	System.out.println("Insira seu nome");
	String nome = entrada.nextLine();
	System.out.println();

	meuGradeBook.displayMessage(nome);
	}


}