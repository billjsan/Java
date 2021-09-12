package capitulo_04;

/**
 * questão 8
 * @author Willian Santos
 *
 */
public class Student {
	
	private String nome;
	private double media;
	
	/**
	 * Construtor da classe
	 * @param nome recebe o nome do aluno
	 * @param media recebe a media do auluno
	 */
	public Student(String nome, double media) {
	
		this.nome = nome;
		
		defineMedia(media);//questao 10
		
//		/**
//		 * tomei a liberdade de criar um if com 
//		 * o operador && para melhor a legibilidade.
//		 * tem o mesmo comportamento do exemplo do 
//		 * livro
//		 */
//		if(media >= 0.0 && media <= 100) {
//			this.media = media;
//		}//fim do if
		
	}//fim do contrutor
	
	/**
	 * adiciona o nome do aluno 
	 * @param nome
	 */
	public void setNome(String nome) {this.nome = nome;}
	
	/**
	 * pega o nome do aluno
	 * @return
	 */
	public String getNome() {return this.nome;}
	
	/**
	 * adiciona media do aluno
	 * @param media
	 */
	public void setMedia(double media) {
		
		defineMedia(media);//Questão 10
		
//		if (media >=0 && media <=100) {
//			
//			this.media = media;
//		}
	}//fim do setMedia
	
	/**
	 * recupera o valor da media 
	 * @return
	 */
	public double getMedia() {return this.media;}

	/**
	 * recupera a letra correspondente
	 * a nota do aluno
	 * @return
	 */
	public String getLetraNota() {
		
		String nota;

		if(media>=90.0) {
			nota = "A";
		}else if(media >=80) {
			nota = "B";
		}else if(media >= 70) {
			nota = "C";
		}else if(media >= 60) {
			nota = "D";
		}else {
			nota = "F";
		}
		
		return nota;
	}//fim do getLetraNota
	
	/**
	 * questão 10
	 */
	private void defineMedia(double media) {
		
		if (media >=0 && media <=100) {
			
			this.media = media;
		}
	}//fim do defineMedia
	
	/**
	 * Questao 11
	 * @return
	 */
	public String obtemLetraNota() {
	
		return (
			(media >= 90.00) ? "A": 
			(media >= 80.00) ? "B": 
			(media >= 70.00) ? "C":
			(media >= 60.00) ? "D": "F");
		
	}//fim do obtemLetraNota
	
	/**
	 * Questao 12
	 */
	public String toString() {
	
		String texto = String.format("A nota de %S foi: %.2f -> %s",
				nome, media,obtemLetraNota() ); 
		
	return texto;
		
	}// fim toString
}
