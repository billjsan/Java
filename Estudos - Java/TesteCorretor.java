/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: nov/2020
autor: Willian Santos */


import java.util.Scanner;
import javax.swing.JOptionPane;

public class TesteCorretor{



	public static void main (String[] args){
	
	double media = 0.0;
	String message;
	int total = 0;
	int entrada = 10;
	int contador = 0;
	int aprovados = 0;
	
	JOptionPane.showMessageDialog(null,"Bem vindo");	

		while(entrada != 0){

			entrada = Integer.parseInt(JOptionPane.showInputDialog(null,
			"Entre com situacao do aluno:\n1 aprovado\n2 reprovado.\n\nPress 0 para sair"));

				switch (entrada){

				case 0:
				media = (double) aprovados/contador ;
				message = String.format("Alunos Aprovados: %d\nAlunos Reprovados: %d",aprovados,(contador - aprovados));
				
					if(media >= 0.8){
					JOptionPane.showMessageDialog(null,
					"Parabens instrutor!!!\nAproveitamento da turma maior que 80% ");
					JOptionPane.showMessageDialog(null,message);
					}
 
				JOptionPane.showMessageDialog(null,"Voce escolheu sair, ate mais!");
				break;
			
				case 1:
				JOptionPane.showMessageDialog(null,"Aluno Aprovado");
				aprovados ++;
				contador ++;
				break;
			

				case 2:
				JOptionPane.showMessageDialog(null,"Aluno Reprovado");
				contador ++;
				break;
		
				default: 
				JOptionPane.showMessageDialog(null,"Voce digitou um dado invalido!\n Digite 0 para sair");
				break;
				}

		}


	}
}