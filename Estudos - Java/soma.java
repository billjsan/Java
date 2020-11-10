
import java.util.Scanner;

public class soma{

	public static void main(String[] args ){
	Scanner input = new Scanner (System.in);

	int num1;
	int num2;
	int sum;

	System.out.print("Insira primeiro inteiro");
	num1= input.nextInt();

	System.out.print("Insira segundo inteiro");
	num2 = input.nextInt();

	sum = num1 + num2;

	System.out.printf("a soma eh: %d",sum);
	}

}