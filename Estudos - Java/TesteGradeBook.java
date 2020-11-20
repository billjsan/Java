/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: nov/2020
autor: Willian Santos */



import java.util.Scanner;

public class TesteGradeBook{


	public static void main(String[] args){
	GradeBook myGradeBook = new GradeBook("\nIntroducao a programacao Java");
	
	myGradeBook.displayMessage();
	myGradeBook.inputGrades();
	myGradeBook.displayGradeReport();
	}

}