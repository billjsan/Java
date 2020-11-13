import javax.swing.JFrame;


public class TesteDrawPanel {

	public static void main (String[] args){
	
	DrawPanel painel = new DrawPanel();

	JFrame application = new JFrame();

	application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	application.add(painel);
	application.setSize(1200,500);
	application.setVisible(true);
	}

}