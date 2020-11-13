//aprendendo Java - 
//usando notepad e JDK 15.0.1
//livro de referencia:
//data: 10/11/2020
//autor: willian santos

//classe referenciada no programa TesteGradeBook.java

import java.util.Scanner;

public class GradeBook{

	private String courseName;

	
	public GradeBook(String name){ //cria o metodo GradeBook
	courseName = name;
	}

	public void setCourseName(String name){
	courseName = name;
	}

	public String getCourseName(){
	return courseName;
	}

	public void displayMessage(){
	System.out.printf("welcome to the GradeBook: %s\n",getCourseName());
	}

	public void determineClassAverage(){
	
	Scanner input = new Scanner(System.in); //cria o objeto input que herda a classe Scanner 
	
	int total;
	int gradeCounter;
	int grade;
	int average;

	total = 0;
	gradeCounter = 1;

		while(gradeCounter <= 10){
		System.out.print("Enter grade: ");
		grade = input.nextInt();
		total = total + grade;
		gradeCounter = gradeCounter + 1;
		
		}
	average = total /10;
	System.out.printf("\nTotal of all 10 grades is %d\n",total);
	System.out.printf("\nClass average is %d\n",average);
	}

}