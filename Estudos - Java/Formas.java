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

	//cria a classe Formas que extende Jpanel
public class Formas extends JPanel{  
 
	//armazena a escolha do usuario
private int escolha;	

		//cria construtor que atribui a escolha do usuario 
	public Formas(int escolha_usuario){ 

		//atribui o valor do usuario à variavel de instância escolha
	escolha = escolha_usuario;
	}

		//chama o metodo de desenho da classe JPanel  
	public void paintComponent(Graphics g){
 
		//declaração exigida pela classe JPanel tal qual este exemplo. 
	super.paintComponent(g); 

			//cria um loop com 10 repetições
		for (int i=0; i<10; i++){
	
				//toma uma ação em função da entrada do usuário
			switch(escolha){

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