package entities;

public abstract class Account {
	
	private Integer number;
	private String holder;
	protected Double balance; //antes era private. Foi alterado para poder usar o objeto na subclasse.
	
	
	public Account() {
		
	}


	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}


	//setBalance foi retirado, pois não pode alterar o saldo da conta livremente!
	
	//operacao de saque
	
	public void  withdraw(double amount) {
		balance -=amount + 5.0;
	}
	
	//operacao deposito
	public void deposit(double amount) {
		balance +=amount;
	}
	
	
}
