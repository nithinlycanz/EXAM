import java.util.Scanner;
class Prime{
	public static void main(String[]args)
	{
		int n,i,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=s.nextInt();
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}
}
