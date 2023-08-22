import java.util.Scanner;
class Bank{
	static double acc_no;
	static int balance;
	static String name;
	static String type;
	void details(){
		Scanner na=new Scanner(System.in);
		System.out.println("Enter the name :");
		name=na.next();
		Scanner no=new Scanner(System.in);
		System.out.println("Enter the A/C number :");
		acc_no=no.nextInt();
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the A/C type :");
		type=t.next();
	}
	void deposit(){
		int depo;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the amount to deposit :");
		depo=s1.nextInt();
		balance=balance+depo;
		System.out.println("Balance:"+balance);
	}
	void withdraw(){
		int amount;
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the amount to withdraw :");
		amount=s2.nextInt();
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("Balance:"+balance);
		}
		else
		{
			System.out.println("Insufficient balance...");
		}
	}	
	void display(){
		System.out.println("Name : "+name);
		System.out.println("A/C Number : "+acc_no);
		System.out.println("A/C Type : "+type);
		System.out.println("Balance : "+balance);
		
	}
	
	public static void main(String[]args){
		Bank bn=new Bank();
		bn.details();
		bn.deposit();
		bn.withdraw();
		bn.display();
		
		
	}
}

