class Stack{
	private int maxSize;
	private int [] stackArray;
	private int top;

	public Stack(int size){
		maxSize = size;
		stackArray=new int[maxSize];
		top=-1;
	}
	public boolean isEmpty(){
		return(top==-1);
	}
	public boolean isFull(){
		return(top==maxSize-1);
	}
	public void push(int value) throws IllegalStateException{
		if(isFull()){
			throw new IllegalStateException("Stack is full. Cannot push element");
		}
		stackArray[++top]=value;
		System.out.println("pushed "+value+" into the stack");
	}
	public int pop() throws IllegalStateException{
		if(isEmpty()){
			throw new  IllegalStateException("stack is empty. Cannot pop elements");
		}
		int value=stackArray[top--];
		System.out.println("popped "+value+ " from the stack");
		return value;
		}
}
public class Main{	
	public static void main(String[] args){
		Stack stack=new Stack(5);
		try{
			stack.push(10);
			stack.push(20);	
			stack.push(30);
			stack.push(40);
			stack.push(50);
			stack.push(60);
		}
		catch(IllegalStateException e){
			System.out.println(e.getMessage());}
		try{
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		}
		catch (IllegalStateException e){
			System.out.println(e.getMessage());
		}
		}
}
