package capitulo_02;

public class Welcome1 {
	

	/**
	 * método estatico principal
	 * é o início da aplicaçao java
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Criação e inicialização 
		 * de variáveis locais
		 */
		String nome = "Willian Santos";
		String matricula = "20202Y6-RC0337";
		String dataHora = "17/08/2021 22:25";
		String msg = "vamos programar!";
		
		/**
		 * Questão 3
		 */
		//System.out.println("Welcome to Java Programming!");
		
		/**
		 * Questão 4
		 */
		System.out.print("Bem-vindo, ");
		System.out.print("Willian Santos 20202Y6-RC0337");
		System.out.print(" ! Saudações!");
		System.out.print("\n");
		
		/**
		 * Questão 5
		 */
		System.out.print(
				"Bem-vindo, Willian Santos 20202Y6-RC0337 ! Saudações!\n");
		
		/**
		 * Questão 6
		 */
		System.out.print(
				"Bem-vindo,\nWillian Santos\n20202Y6-RC0337\n! Saudações!\n");

		/**
		 * Questão 7
		 */
		System.out.print("\n\tWelcome\n\tto\n\tJava\n\tProgramming!\n");
		
		/**
		 * Questão 8 
		 */
		System.out.print("\n\t\"Welcome\n\tto\n\tJava\n\tProgramming!\"\n");
		
		/**
		 * Questão 9
		 */
		System.out.printf(
				"Bem-vindo, %s %s ! Saudações! %s %s\n"
				,nome, matricula, dataHora,msg);
	
	}

}
