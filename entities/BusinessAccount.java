package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	

	public BusinessAccount() {
		super();//criado um super aqui, pois, futuramente pode ser que no construtor padrão 
				//da classe Account tenha alguma lógica que permita tb implementar aqui.
	}

	//criacao do Construtor com argumentos
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}


	public Double getLoanLimit() {
		return loanLimit;
	}


	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//emprestimo
	public void loan(Double amount) {
		if(amount <= loanLimit) {//só vou depositar este valor na conta, se a quantia que to tentando emprestar
								 // é menor ou igual ao limite de emrestimo
			
			//quando estava com o modificador de acesso private na super classe deposit(amount);
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void  withdraw(double amount) {
		super.withdraw(amount);//efetuar o saque normal
		balance -= 2.0;
	}
	
}
