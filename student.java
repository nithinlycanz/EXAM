import java.util.Scanner;
class Student{
	static String name;
	static int rno,m1,m2,m3,avg;
	void average(){
		avg=(m1+m2+m3)/3;
		
	}
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rno);
		System.out.println("Average mark: "+avg);
	}
	public static void main(String[]args){
		Scanner na=new Scanner(System.in);
		System.out.println("Enter the name :");
		name=na.next();
		Scanner no=new Scanner(System.in);
		System.out.println("Enter the Rollnumber :");
		rno=no.nextInt();
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the mark :");
		m1=m.nextInt();
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the mark :");
		m2=n.nextInt();
		Scanner o=new Scanner(System.in);
		System.out.println("Enter the mark :");
		m3=o.nextInt();
		Student obj=new Student();
		obj.average();
		obj.display();
	}
}
