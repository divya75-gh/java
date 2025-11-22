package practicejava;
import java.util.Scanner;
public class method {
	double balance = 0;
	
	Scanner money = new Scanner(System.in);
	void creditamount() { // method
		System.out.println( "before credit balance  :" + balance);
		System.out.println(" enter amount to credit:");
		double amount = money.nextDouble();
		 balance += amount;
		 System.out.println(" after adding amount balance:" + balance);
	}
	void debitamount() { //method
		System.out.println("before debit balance :" + balance);
		System.out.println(" enter amount you want to debit:");
		double amount= money.nextDouble();
		if (balance < amount) {
			System.out.println("insufficient balance");
		}
		else {
		balance -= amount;
		System.out.println("after debit balanc is :" + balance);	
		}
		
	}
	
	method(){ //constructor
		System.out.println("balance before credit and debit "  + balance);
	}
	method(double presentBalance) {
	    presentBalance = balance;
	    System.out.println(" initial balance: " + balance);
	}

	public static void main(String[] args) {
		
        method obj = new method();
        obj.creditamount();
        obj.debitamount();
        
        method obj2 = new method();
        obj2.creditamount();
        obj2.debitamount();
        
        
	}

}
