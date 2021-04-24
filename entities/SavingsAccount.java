package entities;

//o final não permite que seja criada uma subclasse .
public class SavingsAccount extends Account {

	private Double interesRate;

	
	public SavingsAccount() {
		super();
	}


	public SavingsAccount(Integer number, String holder, Double balance, Double interesRate) {
		super(number, holder, balance);
		this.interesRate = interesRate;
	}


	public Double getInteresRate() {
		return interesRate;
	}


	public void setInteresRate(Double interesRate) {
		this.interesRate = interesRate;
	}
	
	//atualizar o saldo com a taxa de juros
	public void updateBalance() {
		balance += balance * interesRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
