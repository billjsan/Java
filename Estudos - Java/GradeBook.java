//aprendendo Java - 
//usando notepad e JDK 15.0.1
//livro de referencia:
//data: 10/11/2020
//autor: willian santos

//classe referenciada no programa TesteGradeBook.java

public class GradeBook{

	private String courseName;

	public void setCourseName(String name){
	courseName = name;
	}

	public String getCourseName(){
	return courseName;
	}

	public void displayMessage(){
	System.out.printf("welcome to the GradeBook: %s\n",getCourseName());
	}

}