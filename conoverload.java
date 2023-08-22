import java.util.Scanner;
class Faculty{
	String name;
	public Faculty(){
		name="Unknown";
	}
	public Faculty(String name){
		this.name=name;
	}
	public String getname(){
	return name;
	}
	public static void main(String[]args){
	Faculty f1=new Faculty();
	System.out.println("Faculty name : "+f1.getname());
	Faculty f2=new Faculty("Anu");
	System.out.println("Faculty name : "+f2.getname());
	}
}
