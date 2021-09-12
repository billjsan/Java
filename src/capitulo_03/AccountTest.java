package capitulo_03;

import java.util.Scanner;
import capitulo_03.Account;

import javax.swing.JOptionPane;

/**
 * Questão 4
 * @author wjeff
 *
 */
public class AccountTest {


	
	/**
	 * Método main chamado pela JVM para 
	 * inciar a aplicacao
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Instancia um objeto do tipo scanner
		 * para capturar a entrada do teclado
		 */
		Scanner entrada = new Scanner(System.in);
		

		
//		/**
//		 * Instancia um objeto do tipo account
//		 */
//		Account conta = new Account();
		
//		/**
//		 * Questão 9
//		 * 
//		 * Instancia um objeto do tipo account
//		 * com construtor
//		 */
//		Account conta = new Account("João");
		
//		/**
//		 * Instancia um objeto do tipo account
//		 * com construtor
//		 */
//		Account conta2 = new Account("maria");
		
		
		/**
		 * Questao 12
		 * 
		 * instancia dois objetos do tipo Account
		 * e inicializa seus campos
		 */
		Account conta = new Account("João", 50.000);
		Account conta2 = new Account("maria", -7.53);
		
		/**
		 * Questão 17
		 */
		displayAccountGrafico(conta);
		displayAccountGrafico(conta2);		
		
//		/**
//		 * Imprime o valor atual da variavel 
//		 * de instancia do objeto conta
//		 */
//		System.out.printf("O nome incial é: %s\n", conta.pegaNome());
		
//		/**
//		 * questao 12
//		 * 
//		 * imprime os valores iniciais e os saldos
//		 */
//		System.out.printf("%s saldo : %.2f %n",
//				conta.pegaNome(), conta.pegarSaldo());
//		System.out.printf("%s saldo : %.2f %n",
//				conta2.pegaNome(), conta2.pegarSaldo());
		
//		/**
//		 * Questão 16
//		 */
//		mostrarConta(conta);
//		mostrarConta(conta2);
		
//		/**
//		 * Solicita que o usuário insira um 
//		 * nome para o objeto nome
//		 */
//		System.out.println("Entre coom o nome: ");
		
//		/**
//		 * Questao 12
//		 * 
//		 *  solicita do usuáro um valor para o 
//		 *  depósito e atribui ao campo depósito da classe
//		 *  Account em seguida o sistema mostra o valor atual
//		 *  dos valores para os dois objetos
//		 * 
//		 */
		System.out.println("Entre com o valor do depósito para a conta 1: ");

		double deposito = entrada.nextDouble();
		System.out.printf("%nAdicionando %.2f a conta 1 %n%n",
				deposito);
		conta.deposito(deposito);
		
		/**
		 * Questao 17
		 */
		displayAccountGrafico(conta);
		displayAccountGrafico(conta2);
		
//		/**
//		 * Questão 16
//		 */
//		mostrarConta(conta);
//		mostrarConta(conta2);
		
		
//		System.out.printf("O saldo de %s = %.2f%n", 
//				conta.pegaNome(), conta.pegarSaldo());
//		System.out.printf("O saldo de %s = %.2f%n", 
//				conta2.pegaNome(), conta2.pegarSaldo());
//		// mesmo comportamento que o anterior porém para outro objeto
		System.out.println("Entre com o valor do depósito para a conta 2: ");
		double deposito2 = entrada.nextDouble();
		System.out.printf("%nAdicionando %.2f a conta 2 %n%n",
				deposito2);
		conta2.deposito(deposito2);
		
//		/**
//		 * Questão 16
//		 */
//		mostrarConta(conta);
//		mostrarConta(conta2);
		
		/**
		 * Questão 17
		 */
		displayAccountGrafico(conta);
		displayAccountGrafico(conta2);
		

		
//		System.out.printf("O saldo de %s = %.2f%n", 
//				conta.pegaNome(), conta.pegarSaldo());
//		System.out.printf("O saldo de %s = %.2f%n", 
//				conta2.pegaNome(), conta2.pegarSaldo());
		
		
//		/**
//		 * Captura um nome do teclado 
//		 * e atribui a variavel local nome
//		 */
//		String nome = entrada.nextLine();
		
		
//		/**
//		 * Evoca o método publico do objeto 
//		 * conta e repassa para ele o valor local 
//		 * para o nome
//		 */
//		conta.adicionaNome(nome);
		
//		/**
//		 * Pula uma linha
//		 */
//		System.out.println();
		
//		/**
//		 * evoca o método que retorna o valor
//		 * da variável de instancia do objeto conta
//		 * e imprime na tela o valor atual
//		 */
//		System.out.printf("O nome no objeto Conta é: %s\n", conta.pegaNome());
		
	}
	
	/**
	 * Questão 16
	 */

	public static void mostrarConta(Account conta) {
		
		/**
		 * exibe os valores do nome e do saldo
		 */
		System.out.printf("O Saldo de %s é: %.2f %n",
				conta.pegaNome(), conta.pegarSaldo());
	}
	
	/**
	 * Questão 17
	 * @param accountToDisplay
	 */
	public static void displayAccountGrafico(Account conta) {
		
		/**
		 * Variável local para armazenar os valores
		 * contidos no nome
		 */
		String nome = conta.pegaNome();
		
		/**
		 * Variável local para armazenar os valores
		 * contidos no saldo
		 */
		String saldo = String.valueOf(conta.pegarSaldo());
		
		/**
		 * Formata a mensagem para ser impressa na tela
		 */
		String mensagem = String.format("O saldo de %s é:  %s", nome,saldo)  ;
		
		/**
		 * Cria uma janela com o texto formatado
		 */
		JOptionPane.showMessageDialog( null, mensagem);
	}
	


}
