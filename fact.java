
import java.util.Scanner;
class Fact{
	public static void main(String[]args)
	{
		int n,i,f=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit :");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial= "+f);
	}
}
