package capitulo_04;

public class Testa {

	public static void main(String[] args) {
		
		/**
		 * Questao 2
		 * 
		 * instancia da classe ExemploCap04
		 */
		ExemplosCap04 meuexemplo = new ExemplosCap04();
		
		/**
		 * chamada do metodo exemplosSelecao
		 */
		meuexemplo.exemplosSelecao(10);
		//fim questao 2 --------------------------------------------------------
		
		/**
		 * Questao 3
		 * 
		 * cria um array com valores quaisquer
		 */
		int[] valores = {20,35,50,45,65,52};
		
		//passa o array como parametro para o metodo
		meuexemplo.exemploLacos(valores);

		//fim questao 3 --------------------------------------------------------
		
		/**
		 * Questao 4
		 * 
		 */
		meuexemplo.exemploSelecaoSwitch(100);
		
		//fim questao 4 --------------------------------------------------------
		
		/**
		 * Questao 5
		 */
		meuexemplo.exemploElseOscilante(4,5);
		//fim questao 5 --------------------------------------------------------
		
		
		/**
		 * Questao 7
		 */
		meuexemplo.exemploOperadorCondicional(6);
		
		


		
		
	}
	

}
