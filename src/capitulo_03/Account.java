package capitulo_03;

/**
 * Questão 2
 */
public class Account {
	
	/**
	 * Variável de instância da classe
	 */
	private String nome;
	
	/**
	 * Questão 10
	 * 
	 * variável de instacia
	 */
	private double saldo;
		
	
	/**
	 * Questão 7
	 * 
	 * Construtor para inicializar o 
	 * valor do campo nome
	 */
	public Account (String nome, double saldo) {
		
		/**
		 * Atribui o valor recebido como 
		 * parâmetro ao campo nome
		 */
		this.nome = nome;

		
		
		/**
		 * questão 10
		 * 
		 * verifica se o valor atribuído 
		 * ao saldo é positivo, se nao for
		 * configura para o valor inicial para 
		 * o tipo double 0.0
		 */
		if(saldo > 0.0) {
			this.saldo = saldo;
		}
	}


	/**
	 * Método publico da classe
	 * método "set"
	 * @param nome
	 */
	public void adicionaNome(String nome) {
		
		/**
		 * Armazena na variável de instância o 
		 * valor recebido como parâmetro pelo 
		 * método
		 */
		this.nome = nome;
	}
	
	/**
	 * Método público da classe
	 * método "get"
	 * @return
	 */
	public String pegaNome() {
		
		/**
		 * Retorna o conteúdo da variável de 
		 * instância mara a chamadora do método
		 */
		return nome;
	}
	
	
	/**
	 * questão 10
	 * 
	 * método que atualiza o valor do saldo
	 * para valores positivos, ou seja operação
	 * de depósito
	 * @param valor
	 */
	public void deposito(double valor) {
		
		
		/**
		 * questão 10
		 * 
		 * Checa se o valor é positivo
		 * e atribui a variavel de instancia
		 * saldo
		 */
		if (valor > 0.0) {
			
			/**
			 * questão 10
			 * 
			 * atribui a variavel saldo 
			 * o valor dela + o valor do
			 * depósito
			 */
			saldo += valor;
		}
	}
	
	
	/**
	 * questão 10
	 * 
	 * metodo que verifica o valor 
	 * atual da variável saldo
	 */
	public double pegarSaldo() {
		
		return saldo;
	}
	


}
