/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: 25/NOV/2020
autor: Willian Santos 

*/

	
import java.util.Random;	//importa a classe random do pacote java util 
import java.util.Scanner;	//importa a classe Scanner do pacote java util 
	
public class NumAleatorio {

	public static void main(String[] args){

		//cria o objeto $meuNum da classe Random
	Random $meuNum = new Random();

		//cria o objeto $entrada da classe Scanner
	Scanner $entrada = new Scanner(System.in);

		//variavel armazena numero gerado 
	int _num = 0;

		//variavel armazena a entrada do usuario
	int _entrada = 0;

	
			//fica preso no laço até digitar 1 
		while(_entrada != 1 && _entrada != 2 ){

		System.out.printf("\nDigite 1 para rolar o dado de 6 lados" + 
		"\nDigite 2 para sortar desenas da mega-sena " );
		_entrada = $entrada.nextInt();
		}

		if(_entrada == 1){

			//gera um int aleatorio entre 1 e 6 
		_num = 1 + $meuNum.nextInt(6);

		System.out.printf("\nO valor do dado foi: %d", _num);
		}

		if(_entrada == 2){

		int[] $numMega = new int[6];


		System.out.printf("Os numeros dorteados sao: ");

			for(int i = 0; i<6; i++){
			
			$numMega[i] = 1 + $meuNum.nextInt(60);
			System.out.printf(" %d", $numMega[i]);
			}
		
			

		}




	}
}
