import java.util.Scanner;
class Details{
	public static void main(String[]args){
	
	student s=new student();
	s.data();
	s.average();	
	}
}
class Person{
	void data(){
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the name :");
	String name=obj.next();
	System.out.println("Enter the age :");
	int age=obj.nextInt();
	System.out.println("Enter the gender :");
	String gen=obj.next();
	}
}
class student extends Person{
	void average(){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the mark1 :");
		int m1=obj.nextInt();
		System.out.println("Enter the mark2 :");
		int m2=obj.nextInt();
		System.out.println("Enter the mark3 :");
		int m3=obj.nextInt();
		int total=m1+m2+m3;
		System.out.println("Total mark= "+total);
		int avg=(m1+m2+m3)/3;
		System.out.println("Average mark= "+avg);
		if(avg>80)
			System.out.println("Grade = A");
		else if(avg>60&&avg<80)
			System.out.println("Grade = B");	
		else if(avg>40&&avg<60)
			System.out.println("Grade = C");
		else if(avg>20&&avg<40)
			System.out.println("Grade = D");
		else
			System.out.println("Grade = E");
		
	}
}
