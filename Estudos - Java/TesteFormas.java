/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: 20/nov/2020
autor: Willian Santos 

*/


import javax.swing.JFrame;
import javax.swing.JOptionPane;

	//cria a classe que referencia  a classe Formas
public class TesteFormas{
		//funcao principal 
	public static void main(String[] args){
	
		//chama o metodo .showImputDialog envia uma mensagem e salva o retorno em 'entrada'
	String entrada = JOptionPane.showInputDialog(
	"Entre com 0 para desenhar circulos \n" +
	"Entre com 1 para desenhar retangulos\n"+
	"Entre com 2 para desenhar ovais");

		//converte entrada do usuario pra o tipo inteiro
	int escolha = Integer.parseInt(entrada);

		//cria os objetos: painel, da classe Formas e app, da classe JFrame.
	Formas painel = new Formas(escolha);
	JFrame app = new JFrame();


		//passagem de parametros para os metodos da classe JFrame que configuram a janela
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //encerra o programa ao cliclar no x
	app.add(painel);			//adiciona o objeto de desenho a classe da janela  
	app.setSize(500,500);						    //dimensiona a janela
	app.setVisible(true);					        //torna visivel o desenho
	}
}