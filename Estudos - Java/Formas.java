/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: 20/nov/2020
autor: Willian Santos 

*/

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.util.Scanner;

	//cria a classe Formas que extende Jpanel
public class Formas extends JPanel{  
 
	//armazena a escolha do usuario
private int escolha;	

	//flag para checar se o usuario ja iseriu o dado
boolean perg = false;

		//cria construtor que atribui a escolha do usuario 
	public Formas(int escolha_usuario){ 

		//atribui o valor do usuario à variavel de instância escolha
	escolha = escolha_usuario;
	}

		//chama o metodo de desenho da classe JPanel  
	public void paintComponent(Graphics g){
 
		//declaração exigida pela classe JPanel tal qual este exemplo. 
	super.paintComponent(g);

		//chamada dos metodos de JPanel que retornam a largura e altura da janela	
	int L = getWidth(); 
	int A = getHeight();
		
		//variaveis para armazenar o ponto medio da janela
	int PmL = L/2;
	int PmA = A/2;
		//taxa de ampliação do circulo
	int Tx = 10;

		//acumulador da taxa
	int tx = 0;

			//cria um loop com 10 repetições
		for (int i=0; i<10; i++){
	
				//toma uma ação em função da entrada do usuário
			switch(escolha){

				//desenha circulos 
			case 0:

				//define o raio inicial em 10px
			int r = 10;
				//cria vetor para amazenar coordenadas dos pontos a e b e do centro
			int a[] = new int[2];
			int b[] = new int[2];
			int c[] = new int[2];			
			
				//inicializa o ponto central da jenela
			c[0] = PmL;
			c[1] = PmA;

				//coordenadas do desenho
			a[0] = (PmL - r) - tx; 	// coordenada absoluta X do ponto A
			a[1] = (PmA - r) - tx; 	// coordenada absoluta Y do ponto A
			
			b[0] = (2*tx)+r; 	// coordenada relativa X do ponto B
			b[1] = (2*tx)+r; 	// coordenada relativa Y do ponto B

			tx += Tx; 			

			g.drawOval(a[0],a[1],b[0],b[1]);
			
			System.out.printf("Debbug: \nL: %d \nA: %d \nPmL: %d \nPmA: %d",L,A,PmL,PmA);			
			break;
				//desenha um retângulo
			case 1:
			g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
			break;
				//desenha um oval 
			case 2:
			g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
			break;
			
			}
		}
	}
}