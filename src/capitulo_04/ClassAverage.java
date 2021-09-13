package capitulo_04;

import java.util.Scanner;
/**
 * Questão 14
 * @author Willian Santos
 *
 */
public class ClassAverage {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println("Entre com a nota: ");
			
			int nota = entrada.nextInt();
			total += nota;
			contador ++;
		}
		
		int media = total /10;
		
		System.out.printf("\nO total é: %d", total);
		System.out.printf("\nA média é: %d", media);
		

	}

}
