package capitulo_02;

import java.util.Scanner;

public class Exercicios {

	/**
	 * Declaração de constantes
	 */
	private static final String TEXTO_O1 = "Isso é um programa Java";
	private static final String TEXTO_O2 = "Isso é um programa\n";
	private static final String TEXTO_O3 = "Java\n";
	
	public static void main(String[] args) {
		
		/**
		 * Questão 2.3 pagina 49
		 */
		//a)
		int c, issoEUmaVariavel,q76354, numero;
		
		//b)
		System.out.print("Insira um numero inteiro: ");
		Scanner entrada = new Scanner(System.in);
		
		//c)
		int valor = entrada.nextInt();
		
		//d)
		System.out.println(TEXTO_O1);
		
		//e)
		System.out.printf("%s%s",TEXTO_O2 ,TEXTO_O3);
		
		//f
		
		if(valor != 7) {
			System.out.println("O valor de \"valor\" é diferente de 7");
		}
		
		c = 10;
		/**
		 * Questão 2.4 pagina 49
		 * corrigida
		 */
		
		if ( c<7 ) {
			System.out.println("c é menor que 7");
		}
		else {
			System.out.println("c é maior ou igual a 7");
		}
		
		/**
		 * Questao 2.5 pagina 49
		 */
		
		// a)
		// Não entendi o enunciado. Não sei o que seria 
		// "Declarar um programa"
		
		// b)
		Scanner entrada2 = new Scanner(System.in);
		
		//c)
		int x, y, z, resultado;
		
		//d)
		System.out.println("Entre com o primeiro inteiro");
		x = entrada2.nextInt();
		
		//e)
		System.out.println("Entre com o segundo inteiro");
		y = entrada2.nextInt();
		
		//f)
		System.out.println("Entre com o terceiro inteiro");
		z = entrada2.nextInt();
		
		resultado = x * y * z;
		
		System.out.printf("O resultado da soma é %d\n", resultado);
		
		
		//Questão 2.6 pagina 49
		multipica();

	}
	
	/**
	 * Questão 2.6 da pagina 49
	 * Calcula a multiplicação entre 
	 * três numeros inteiros
	 */
	private static void multipica() {
		
		/**
		 * Instancia um objeto Scanner
		 */
		Scanner mMinhaEntrada =  new Scanner(System.in);
		
		/**
		 * Entrada de dados do usuário 
		 */
		System.out.println("Entre com o primeiro inteiro: ");
		int a = mMinhaEntrada.nextInt();
		
		System.out.println("Entre com o segundo inteiro: ");
		int b = mMinhaEntrada.nextInt();
		
		System.out.println("Entre com o terceiro inteiro: ");
		int c = mMinhaEntrada.nextInt();
		
		/**
		 * Saída de dados pelo console
		 */
		System.out.printf(
				"O resultado de %d * %d * %d = %d\n", a, b, c, a*b*c);
	}

	
	
	
	
	
}
