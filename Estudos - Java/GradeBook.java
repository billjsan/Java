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
	double average;

	total = 0;
	gradeCounter = 0;

	System.out.print("Enter grade or -1 to quit: ");
	grade = input.nextInt();

		while(grade != -1){
		total = total + grade;
		gradeCounter ++ ;
		System.out.print("Enter grade or -1 to quit: ");
		grade = input.nextInt();				
		}

		if (gradeCounter != 0){
		average = (double) total /gradeCounter;
		System.out.printf("\nTotal of all %d grades is %d\n",gradeCounter,total);
		System.out.printf("\nClass average is %.2f\n",average);
		}
		
		else{
		System.out.printf("\nNo grades were entered\n");
		}
	}

}