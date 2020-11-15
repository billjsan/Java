import javax.swing.JFrame;

public class TesteExeGUI {

	public static void main (String[] args){
	
	ExeGUI painel = new ExeGUI(); //cria objeto de desenho painel
	JFrame app = new JFrame(); // cria opjeto java frame 
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra no [x]
	app.add(painel);
	app.setSize(900,500);
	app.setVisible(true);
	}




}