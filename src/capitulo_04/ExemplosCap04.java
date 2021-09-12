package capitulo_04;

public class ExemplosCap04 {
	
	/**
	 * Questão 2
	 */
	public void exemplosSelecao(int valor) {
			
		if(valor ==10) {
			System.out.println("Você digitou 10");
		}
		if(valor >=100) {
			System.out.println("Você digitou um valor maior ou igual a 100");
		}else {
			System.out.println("Você digitou um valor menor que 100");
		}
		System.out.println("");
	}// fim questao 2 ----------------------------------------------------------
	
	
	/**
	 * Questão 3
	 */
	public void exemploLacos(int[] valor) {
		
		System.out.println("Usando For");
		
		for(int i =0; i< valor.length; i++) {
			System.out.printf("%d\tvalor = %d\n",i+1,valor[i]);
		}
		System.out.println("");
		
		System.out.println("Usando While");
		
		int cont = 0;
		while(cont < valor.length) {
			System.out.printf("%d\tvalor = %d\n",cont+1,valor[cont]);
			cont++;
		}
		System.out.println("");
		
		System.out.println("Usando Do While");
		
		cont = 0;
		do {
			
			System.out.printf("%d\tvalor = %d\n",cont+1,valor[cont]);
			cont++;
			
		}while(cont < valor.length);
		System.out.println("");
		
	}// fim questao 3 ----------------------------------------------------------
	

	/**
	 * Questão 4
	 */
	public void exemploSelecaoSwitch(int valor) {
		
		System.out.println("usando switch");
		
		switch(valor) {
		
		case 100:	
		case 90:
			System.out.println("A");	
		break;
		
		case 80:
			System.out.println("B");
		break;
		
		case 70:
			System.out.println("C");
		break;
		
		case 60:
			System.out.println("D");
		break;
		
		default:
			System.out.println("F");
		break;
		}
		
	}// fim questao 4 ----------------------------------------------------------
	
	/**
	 * Questão 5
	 */
	public void exemploElseOscilante(int valor1, int valor2) {
		
		System.out.println("");		
		System.out.println("Else flutuante");
		
		if(valor1 > 5)
		if(valor2 > 5)
		System.out.println("os dois valores sao maiores que 5");
		else
		System.out.println("o primeiro valor é menor ou igual a 5");
		
		//evitando o else flutuante com uso de chaves
		System.out.println("");	
		System.out.println("evitando o Else flutuante");
		
		if(valor1 > 5) {
			if(valor2 > 5)
				System.out.println("os dois valores sao maiores que 5");
		}else
		System.out.println("o primeiro valor é menor ou igual a 5");
	}// fim questao 5 ----------------------------------------------------------
	
	/**
	 * Questão 7
	 */
	public void exemploOperadorCondicional(int valor) {
		
		System.out.println("");	
		System.out.println("Operador ternario");	
		System.out.println(valor >= 6 ?"aprovado":"reprovado");
		
	}// fim questao 7 ----------------------------------------------------------
	
}

