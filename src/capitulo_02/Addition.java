package capitulo_02;

import java.util.Scanner;

/**============  QUESTÃO 10  ==================
 * Classe que faz a leitura de dois valores
 * do teclado e mostra no console o resultado 
 * da soma aritimética
 * @author willian santos
 *
 */
public class Addition {

	public static void main(String[] args) {
		
		/**
		 * Instancia do objeto Scanner que faz 
		 * a leitura do teclado através do parâmetro 
		 * passado ao construtor da classe Scanner
		 */
		Scanner entrada = new Scanner (System.in);
		
		/*
		 * Declaração das variaveis locais
		 * para o armazenamento dos dados 
		 * inseridos pelo usuário e de retorno
		 * da soma
		 */
		int numero1;
		int numero2;
		int soma;
		
		//Questão 14
		int subtracao;
		int divisao;
		int multiplicacao;
		int resto;
		
		/**
		 * Solicita do usuário o primeiro inteiro 
		 * e captura valor digitado armazenando 
		 * na variavel local numero1
		 */
		System.out.println("Entre com o primeiro inteiro");
		numero1 = entrada.nextInt();

		/**
		 * Solicita do usuário o primeiro inteiro 
		 * e captura valor digitado armazenando 
		 * na variavel loca2 numero1
		 */
		System.out.println("Entre com o segundo inteiro");
		numero2 = entrada.nextInt();
		
		/**
		 * Realiza a soma aritimetica dos valores
		 * inseridos e mostra o resultado no console
		 */
		soma = numero1 + numero2;
		System.out.printf("A soma é %d\n", soma);
		
		/**===============  QUESTÃO 14  ==================
		 * 
		 * realiza a sutracao dos dois valores
		 */
		subtracao = numero1 - numero2;
		System.out.printf("O resultado de %d - %d é = %d\n",
				numero1,numero2,subtracao);
		
		/**
		 * Realiza a multiplicacao dos dois valores
		 */
		multiplicacao = numero1 * numero2;
		System.out.printf("O resultado de %d * %d é = %d\n",
				numero1,numero2,multiplicacao);
		
		/** =============== QUESTÃO 16 ==================
		 * 
		 */
		if(numero2==0) {
			System.out.println("não é possível dividir por zero");
		}
			
		else {
			
		/**QUESTAO 14
		 * Realiza a divisao inteira de dois valores
		 */
		divisao = numero1 / numero2;
		System.out.printf("O resultado de %d / %d é = %d\n",
				numero1,numero2,divisao);	
		
		/**QUESTAO 14
		 * Realiza a operação de resto entre a divisao 
		 * inteira dos dois numeros
		 */
		resto = numero1 % numero2;
		System.out.printf("O resto da divisao de %d por %d é = %d\n",
				numero1,numero2,resto);

		}
		

		

	}

}
