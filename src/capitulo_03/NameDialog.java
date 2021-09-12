package capitulo_03;

import javax.swing.JOptionPane;

/**
 * Questão 15
 * @author wjeff
 *
 */
public class NameDialog {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual seu nome? ");
		
		String mensagem = String.format("Bem-vindo ao Java %s ",nome);
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
