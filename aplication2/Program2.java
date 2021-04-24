package aplication2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities2.Employee;
import entities2.OutsourcedEmployee;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee>  list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		int n =  sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println("Employee #" + i + " data: " );
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0); 
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {//se y, o funcion�rio � terceirizado
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				//Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge); 
				//list.add(emp);
				//OU:
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		
		//leitura: Para cada funcionario em na minha lista list ,fa�a:
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		
		sc.close();
		
	}

	
}
