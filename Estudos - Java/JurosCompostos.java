public class JurosCompostos {

	public static void main (String[] Args){

	double montante;
	double deposito = 1000.0;
	double taxa = 0.05;
	
	System.out.printf("\n%8s%22s \n","Ano", "Montante depositado");


		for (int ano = 1; ano<=10; ano++){
		montante = deposito * Math.pow(1.0 + taxa, ano);
		System.out.printf("%8d%,15.2f\n", ano, montante);
		}


	}


}