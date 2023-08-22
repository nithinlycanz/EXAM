import java.util.Scanner;
class Overload{
	public static void main(String[]args){	
	Overloading ob=new Overloading();
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the side of a square :");
	int n=obj.nextInt();
	ob.areas(n);
	System.out.println("Enter the length of a rectangle :");
	int x=obj.nextInt();
	System.out.println("Enter the bredth of a rectangle :");
	int y=obj.nextInt();
	ob.areas(x,y);
	System.out.println("Enter the radius of a circle :");
	float r=obj.nextFloat();
	ob.areas(r);
	System.out.println("Enter the height of the triangle :");
	float h=obj.nextFloat();
	System.out.println("Enter the base of the triangle :");
	float b=obj.nextFloat();
	ob.areas(h,b);
	}
}	
class Overloading{
	void areas(int n){
		System.out.println("Area of square: "+n*n);
	}
	void areas(int x,int y){
		System.out.println("Area of rectangle: "+x*y);
	}
	void areas(float r){
		System.out.println("Area of circle : "+r*r*3.14);
	}
	void areas(float h,float b){
		System.out.println("Area of triangle: "+b*h*0.5);
	}	
}
