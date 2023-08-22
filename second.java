import java.util.Scanner;
class Array{
	public static void main(String[]args)
	{
		int i,n,temp,j;
		int a[ ]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n=s.nextInt();
		System.out.println("Enter the elements of the array: ");
		for(i=0;i<n;i++)
		{
			Scanner s1=new Scanner(System.in);
			a[i]=s1.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
			}
		
		}
		System.out.println("Second smallest element is: "+a[1]);
	}
}

