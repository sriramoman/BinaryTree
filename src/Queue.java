
public class Queue {
	class Node{
		BinaryTree data;
		Node next;
		public Node(BinaryTree val){
			data=val;
			next=null;
		}
	}
	public int size;
	Node front=null;
	Node rear=null;
	public void enq(BinaryTree data){
		Node newNode = new Node(data);
		if(front!=null){
			rear.next=newNode;
		}
		else{
			front=newNode;
		}
		rear=newNode;
		size++;
	}
	public BinaryTree deq(){
		if(front==null)
			throw new ArrayIndexOutOfBoundsException("Error dequeueing");
		BinaryTree delNode = front.data;
		front=front.next;
		size--;
		return delNode;
	}
	public BinaryTree poll(){
		return front.data;
	}
}
