/*
Estudos de  Java  
Usando notepad e JDK 15.0.1

livro de referencia: 
Java: como programar 8ª edição 
Deitel,Paul; Deitel Harvey M.
 
data: nov/2020
autor: Willian Santos */


public class Account{

	private double balance; //variavel de instancia(obejto)
 
	public Account(double initialBalance){

		if(initialBalance > 0.0){
		balance = initialBalance;
		}
	}

	public void credit(double amount){
	balance = balance + amount;
	}
	public double getBalance(){
	return balance;
	}

}