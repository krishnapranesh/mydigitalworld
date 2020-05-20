
public class LinkedList {

Node head;
	
class Node{
	
	Node next;
	int data;
	
Node(int data) {
	this.data = data;
	this.next = null;
}

}

private void addToFront(int data) {

	Node newNode = new Node(data);
	newNode.next=head;
	head = newNode;
}

private void addAfterNode(Node prevNode,int data) {
if(prevNode==null) {
	System.out.println("PrevNode is not available");
}
	Node newNode = new Node(data);
	newNode.next = prevNode.next;
	prevNode.next = newNode;
}

private void append(int data) {

	Node newNode = new Node(data);
	
	Node last = head;
	while(last.next!=null) {
		last = last.next;
	}
	last.next = newNode;
	newNode.next=null;
}
	
}
