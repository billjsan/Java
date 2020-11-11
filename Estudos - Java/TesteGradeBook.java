//aprendendo Java - 
//usando notepad e JDK 15.0.1
//livro de referencia:
//data: 10/11/2020
//autor: willian santos

import java.util.Scanner;

public class TesteGradeBook{


	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	GradeBook myGradeBook = new GradeBook();

	System.out.printf("Entre com nome do curso:");
	String theName = input.nextLine();
	myGradeBook.setCourseName(theName);
	System.out.println();
	myGradeBook.displayMessage();
	}


}