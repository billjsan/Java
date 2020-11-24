/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: 23/NOV/2020
autor: Willian Santos 

*/


import javax.swing.JOptionPane;
import java.util.Scanner;

public class AcharMenor{


	public static void main(String[] args){

		//variavel para armazenar entrada do numero de itens	
	int n = 0;

		//armazena o endereço da mensagem ao usuario
	int M = 0;
		//armazena o menor valor registrado
	int _menorHistorico = 0;
	
		//cria uma matriz para armazenar as mensagens personalizadas
	String mensagem[] = new String[10];
	
		//mensagens personalizadas
	mensagem[0] = "\nEntre com primeiro inteiro: ";
	mensagem[1] = "\nEntre com segundo inteiro: ";
	mensagem[2] = "\nEntre com terceiro inteiro: ";
	mensagem[3] = "\nEntre com o proximo inteiro: ";
	mensagem[4] = "\nFavor entrar com proximo valor: ";
	mensagem[5] = "\nProximo por favor: ";
	mensagem[6] = "\nMais um: ";
	mensagem[7] = "\nProximo: ";
	mensagem[8] = "\nQuase la: ";
	mensagem[9] = "\nMais um por gentileza: ";

		//cria o objeto entrada da class Scanner
	Scanner entrada = new Scanner(System.in);

	System.out.printf(
	"\nEntre com a quantidade de numeros a comparar, no minimo 2: ");
	n = entrada.nextInt();

			//enquanto o valor digitado for menor que 2
		while(n < 2){
		System.out.printf(
		"\nEntre com um valor maior ou igual a 2: ");
		n = entrada.nextInt();
		}

	System.out.printf(
	"\nVoce ira inserir %d itens", n);
		
		//cria um vetor de inteiros para armazenar dados do usuario
	int dados[] = new int[n];

			//entrada de dados
		for(int i = 0; i<n; i++){

			//imprime as mensagens pre-definidas 
		System.out.printf("%s",mensagem[M]);
			//recebe o dado do usuario
		dados[i] = entrada.nextInt();
		M++;
				//repete algumas mensagens pre-definidas
			if (M>9){
			M = 4;
			}//fim do if				
		}//fim da entrada de dados

		//define um dos valores digitados como primeira referencia de menor valor
	_menorHistorico = dados[0];

			//tratamento de dados	
		for(int i = 0; i < n - 1; i++){
		
				//testa se a > b e se b < menor valor lido 
			if(dados[i] > dados[i+1] && dados[i+1] < _menorHistorico){

			_menorHistorico = dados [i+1]; //atualiza menor valor
			}
	
				//testa se a < b e se a < menor valor lido
			if(dados[i] < dados[i+1] && dados[i] < _menorHistorico){
			
			_menorHistorico = dados [i+1]; //atualiza menor valor
			}
		}//fim do tratamento de dados

		//imprime o menor valor
	System.out.printf("\nO menor valor digitado foi: %d", _menorHistorico);

	}//fim do main
}//fim da classe AcharMenor