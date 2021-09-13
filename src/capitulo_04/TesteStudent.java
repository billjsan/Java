package capitulo_04;

/**
 * Questão 8
 * @author Willian Santos
 *
 */
public class TesteStudent {

	public static void main(String[] args) {
			
		/**
		 * Cria as instancias dos alunos
		 * e configura seus valores iniciais
		 */
		Student aluno1 = new Student("Pedro", 86.5);
		Student aluno2 = new Student("Maria", 95.5);
		
		/**
		 * Recupera as informações dos alunos
		 */
		System.out.printf("A nota de %s foi: %s\n",
				aluno1.getNome(), aluno1.getLetraNota());
		System.out.printf("A nota de %s foi: %s\n",
				aluno2.getNome(), aluno2.getLetraNota());
			
		/**
		 * Questão 11
		 */
		System.out.printf("A nota de %s foi: %s\n",
				aluno1.getNome(), aluno1.obtemLetraNota());
		System.out.printf("A nota de %s foi: %s\n",
				aluno2.getNome(), aluno2.obtemLetraNota());

		/**
		 * Questão 13
		 */
		System.out.println(aluno1.toString());
		System.out.println(aluno2.toString());
		
		
	}

}
