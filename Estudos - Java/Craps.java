/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: 25/NOV/2020
autor: Willian Santos 

*/

import java.util.Random;

public class Craps{

	//
private static final Random $randomNum = new Random();

	//cria o enumeração com constantes
private enum Status {CONTINUE, WON, LOST};

	//constantes de resultados comuns ao jogo
private static final int SNAKE_YES = 2;
private static final int TREY = 3;
private static final int SEVEN = 7;
private static final int YO_LEVEN = 11;
private static final int BOX_CARS = 12;

		//jogo 
	public void play (){
	
	int _pontos = 0;

	Status gameStatus;
	 
	int _somaDados = rollDice();
	
		switch(_somaDados){

		case SEVEN:

		case YO_LEVEN:

		gameStatus = Status.WON;
		break;

		case SNAKE_YES:
		
		case TREY:
		
		case BOX_CARS:

		gameStatus = Status.LOST;
		break;
	
		default:

		gameStatus = Status.CONTINUE;
		_pontos = _somaDados;

		System.out.printf("Pontuacao : %d", _pontos);
		}//fim do switch 
	

		while(gameStatus == Status.CONTINUE){
		
		_somaDados = rollDice();

			if (_somaDados == _pontos){
			gameStatus = Status.WON;
			}

			else{
				if(_somaDados == SEVEN){
				gameStatus = Status.LOST;
				}
			}//fim do else

		} //fim do while

		if(gameStatus == Status.WON){
		System.out.println("Ganhou!");
		}
		
		else{
		System.out.printf("Perdeu!");
		}

	}//fim do método play

	public int rollDice(){
		
	int dado1 = 1 + $randomNum.nextInt(6);
	int dado2 = 1 + $randomNum.nextInt(6);
		
	int soma = dado1 + dado2;

	System.out.printf("o Jogador jogou: %d + %d ", dado1, dado2);

	return soma;
	} // fim do metodo rollDice

}//fim da classe 