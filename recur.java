import java.util.Scanner;
class fibonacci{
	public static void main(String[]args){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the position : ");
		int x=ob.nextInt();
		System.out.println(x+"th position value in recursive function is :"+fib1(x));
		System.out.println(x+"th position value in non-recursive function is :"+fib2(x));
	}
	static int fib1(int n){
		if(n<=2){
			return 1;
		}
		else
			return fib1(n-1)+fib1(n-2);
	}
	static int fib2(int n){
		int a=0,b=1,c;
		if(n==1){
			 return b;
		}
		for(int i=2;i<=n;i++){
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
}
