
public class Queue {
	class Node{
		BinaryTreeNode data;
		Node next;
		public Node(BinaryTreeNode val){
			data=val;
			next=null;
		}
	}
	public int size;
	Node front=null;
	Node rear=null;
	public void enq(BinaryTreeNode data){
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
	public BinaryTreeNode deq(){
		if(front==null)
			throw new ArrayIndexOutOfBoundsException("Error dequeueing");
		BinaryTreeNode delNode = front.data;
		front=front.next;
		size--;
		return delNode;
	}
	public BinaryTreeNode poll(){
		return front.data;
	}
}
