public class HelloWorldThread{
	public static void main(String[]args){
		HelloThread hT=new HelloThread();
		WorldThread wT=new WorldThread();
		hT.start();
		wT.start();
	}
	static class HelloThread extends Thread{
		@Override
		public void run(){
            
			while(true){
				System.out.println("Hello");
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
	static class WorldThread extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("World");
			try{
				Thread.sleep(3000);}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	}
}
