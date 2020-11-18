//aprendendo Java - 
//usando notepad e JDK 15.0.1
//livro de referencia:
//data: 10/11/2020
//autor: willian santos

import java.util.Scanner;

public class TesteGradeBook{


	public static void main(String[] args){
	GradeBook myGradeBook = new GradeBook("\nIntroducao a programacao Java");
	
	myGradeBook.displayMessage();
	myGradeBook.inputGrades();
	myGradeBook.displayGradeReport();
	}

}