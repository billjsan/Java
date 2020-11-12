//aprendendo Java - 
//usando notepad e JDK 15.0.1
//livro de referencia:
//data: 10/11/2020
//autor: willian santos

import java.util.Scanner;

public class TesteGradeBook{


	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	GradeBook myGradeBook = new GradeBook("");

	GradeBook gradeBook1 = new GradeBook("Introduction to Java Programming\n");
	GradeBook gradeBook2 = new GradeBook("Data Structure in Java\n");

	System.out.printf("\ngradeBook1 course name is: %s",gradeBook1.getCourseName());
	System.out.printf("gradeBook2 course name is: %s",gradeBook2.getCourseName());

	System.out.printf("\nEntre com nome do curso:");
	String theName = input.nextLine();
	myGradeBook.setCourseName(theName);
	System.out.println();
	myGradeBook.displayMessage();
	myGradeBook.determineClassAverage();
	}


}