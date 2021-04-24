package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub

		/*
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCASTING
		//converte um objeto da super classe para subclasse
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; Neste caso daria ero de ClassCastException
		//para testar se o objeo acc3 realmente é do tipo BusinessAccount: instanceof
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan! Emprestimo!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		/*	
		
		/*
		//paara testar o  Override da classe SavingsAccount
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);	
			System.out.println(acc1.getBalance());
			
		//testar a Sobreposição , Override.	
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		
		//testar o super withdraw na classe BussinesAccounnt
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());//sacar o 200.0 , descontar a taxa de 5.0(logica da classe Account), descontar +2 
		*/
		
		/*
		//Para testar o Abstract,na classe Account. Vai dar erro na linha 62
		//Abaixo, exemplos de Polimorfismoe upcasting
		Account acc1 = new Account(1001,"Alex" , 1000.0);
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		*/
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "MAria", 1000.0, 400.00));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum +=acc.getBalance();//somar todos os saldo,independente de conta
		}
		System.out.printf("Total balance: %.2f%n", sum);	
		
		for(Account acc : list ) {
			acc.deposit(10.0);
		}
		for(Account acc : list) {
			System.out.printf("Udpdate balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}

}
