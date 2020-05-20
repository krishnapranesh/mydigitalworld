public class StackUsingArray {

	private static int[] xyz;
	private int top=-1;
	private int Max;
	
	public StackUsingArray(int Max) {
		this.Max = Max;
		this.xyz = new int[Max];
	}

	public void push(int a) {
		if(top<Max) {
			xyz[++top] =a;
		}else {
			System.out.println("Stack is already full");
		}
	}
	
	public int pop() {
		if(top>=0) {
			return xyz[top--];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public int peek() {
		if(top>=0)
		{
			return xyz[top];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public boolean isEmpty() {
		if(top!=-1) return false;
		else return true;
	}
	
	/*
	 * public static void main(String[] args) { StackUsingArray sua= new
	 * StackUsingArray(100); sua.push(100); sua.push(200); sua.push(300);
	 * sua.push(400); sua.push(500); System.out.println(sua.peek());
	 * System.out.println(sua.pop()); System.out.println(sua.peek());
	 * System.out.println(sua.pop()); System.out.println(sua.peek());
	 * System.out.println(sua.pop()); System.out.println(sua.peek());
	 * System.out.println(sua.pop()); System.out.println(sua.peek()); }
	 */	
	
}
