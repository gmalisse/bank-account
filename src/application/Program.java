package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char question = sc.next().charAt(0);
		
		if (question == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, name, initialDeposit);
		}
		else {
			account = new Account(number, name);
			
		}		
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double money = sc.nextDouble();
		account.deposit(money);
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		money = sc.nextDouble();
		account.withdraw(money);
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		sc.close();
	}
}
