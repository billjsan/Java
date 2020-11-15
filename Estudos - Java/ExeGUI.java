import java.awt.Graphics;
import javax.swing.JPanel;

public class ExeGUI extends JPanel{

	public void paintComponent (Graphics g) {	//cria metodo do desenho 

	super.paintComponent(g);	//exibe o painel
	
	int L = getWidth();		// chama metodo que retorna largura da janela
	int A = getHeight();		// chama metodo que retorna altura da janela

	int sumDy = 0;
	int sumDx = 0;
	int dx = 0;
	int dy = 0;

	dx = L/15; 			// divide a largura da janela por 15
	dy = A/15; 			//divide a altura por 15

		for(int i = 0; i<16; i++){
	
		g.drawLine(0+sumDx,A,L,A-sumDy);
		g.drawLine(0,0+sumDy,0+sumDx,A);
		g.drawLine(L-sumDx,0,0,0+sumDy);
		g.drawLine(L,A-sumDy,L-sumDx,0);
		sumDy += dy;
		sumDx += dx;

		}
	
	}

}
