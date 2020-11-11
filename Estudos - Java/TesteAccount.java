import java.util.Scanner;

public class TesteAccount{

	public static void main(String[] args){

	Account conta1 = new Account (0.0);
	Account conta2 = new Account (0.0);

	System.out.printf("\nSaldo da conta 1: R$ %.2f\n",conta1.getBalance());//exibe os valores iniciais
	System.out.printf("Saldo da conta 2: R$ %.2f\n",conta2.getBalance());

	Scanner entrada = new Scanner(System.in);
	double depositAmount;

	System.out.printf("Entre com valor de deposito para conta1: ");
	depositAmount = entrada.nextDouble();
	System.out.printf("\nAdicionando: R$ %.2f a conta 1",depositAmount);
	conta1.credit(depositAmount);

	System.out.printf("Saldo da conta 1: R$ %.2f\n",conta1.getBalance());
	System.out.printf("Saldo da conta 2: R$ %.2f\n",conta2.getBalance());

	System.out.printf("Entre com valor de deposito para conta2: ");
	depositAmount = entrada.nextDouble();
	System.out.printf("\nAdicionando: R$ %.2f a conta 2",depositAmount);
	conta2.credit(depositAmount);

	System.out.printf("Saldo da conta 1: R$ %.2f\n",conta1.getBalance());
	System.out.printf("Saldo da conta 2: R$ %.2f\n",conta2.getBalance());


}

}