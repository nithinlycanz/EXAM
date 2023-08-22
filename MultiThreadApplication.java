import java.util.Random;


class Square extends Thread{

			int x;
			Square(int n)
			{
				x=n;
			}
			public void run(){
				int sqr=x*x;
				System.out.println("Square: "+sqr);
				}
}
class Cube extends Thread{
			int x;
			Cube(int n){
				x=n;
				}
			public void run(){
				int cube=x*x*x;
				System.out.println("cube: "+cube);
				}
			}
				
class Number extends Thread{
public void run(){
	Random r=new Random();
	for(int i=0;i<10;i++){
		int randomInteger=r.nextInt(100);
		System.out.println("Random Integer Generated"+randomInteger);
		Square s=new Square(randomInteger);
		s.start();
		Cube c=new Cube(randomInteger);
		c.start();
	try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		}
		}
}
public class MultiThreadApplication{
public static void main(String[] args){
		Number num=new Number();
		num.start();
	}
	
}
		
