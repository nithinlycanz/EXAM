import java.util.Scanner;
class Degree{
	void getDegree(){
		System.out.println("I got a Degree");
	}
}
class Undergraduate extends Degree{
	void getDegree(){
		System.out.println("Iam an Undergraduate");
	}
}
class Postgraduate extends Degree{
	void getDegree(){
		System.out.println("Iam an Postgraduate");
	}
}
class Education{
	public static void main(String[]args){
	Degree d=new Degree();
	d.getDegree();
	Undergraduate u=new Undergraduate();
	u.getDegree();
	Postgraduate p=new Postgraduate();
	p.getDegree();
	}
}
