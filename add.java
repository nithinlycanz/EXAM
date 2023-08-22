import java.util.Scanner;
class add{
	public static void main(String[]args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the second number: ");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Sum= "+c);
	}
}
