package capitulo_04;

import java.util.Scanner;
/**
 * Questão 14
 * @author Willian Santos
 *
 */
public class ClassAverage {

	public static void main(String[] args) {

//		Scanner entrada = new Scanner(System.in);
//		
//		int total = 0;
//		int contador = 1;
//		
//		while(contador <= 10) {
//			System.out.println("Entre com a nota: ");
//			
//			int nota = entrada.nextInt();
//			total += nota;
//			contador ++;
//		}
//		
//		int media = total /10;
//		
//		System.out.printf("\nO total é: %d", total);
//		System.out.printf("\nA média é: %d", media);
		

		mainComSentinela();
	}
	
	/**
	 * Questão 24
	 */
	public static void mainComSentinela() {
		
		Scanner entrada = new Scanner(System.in);
		
		int total = 0;
		int contador = 0;
		
		System.out.printf("%nEntre com nota ou -1 para sair: ");
		int nota = entrada.nextInt();
		
		while(nota != -1) {
			
			total += nota;
			contador ++;
			
			System.out.println("Entre com a nota ou -1 para sair: ");
			nota = entrada.nextInt();
		}
		
		if(contador != 0) {
			
			double media = (double)  total /contador;
			
			System.out.printf("O total das %d notas é:%d%n",
					contador, total);
			System.out.printf("A média é: %.2f", media);	
		}else {
			System.out.println("Nenhuma nota digitada");
		}
	}

}
