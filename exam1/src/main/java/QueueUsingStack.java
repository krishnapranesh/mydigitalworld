
public class QueueUsingStack {
	
	private StackUsingArray sua;
	private StackUsingArray tmpStack ;
	public QueueUsingStack(int Max) {
		this.sua = new StackUsingArray(Max);
		this.tmpStack = new StackUsingArray(Max);
	}
	
	
	private void add(int a) {
			
			while(!sua.isEmpty()) {
				tmpStack.push(sua.pop());
			}
			sua.push(a);
			while(!tmpStack.isEmpty()) {
				sua.push(tmpStack.pop());
			}
		}

	private int remove() {
	return sua.pop();
	}
	
	public static void main(String[] args) {

		QueueUsingStack QUS = new QueueUsingStack(100);
		
		QUS.add(100);
		QUS.add(200);
		QUS.add(300);
		QUS.add(400);
		QUS.add(500);
		QUS.add(600);
		System.out.println(QUS.remove());
		System.out.println(QUS.remove());
		System.out.println(QUS.remove());
		
	}

}
