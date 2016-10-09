
public class Stack {
	class Node{
		BinaryTree data;
		Node next;
		public Node(BinaryTree val){
			data=val;
		}
	}
	Node top=null;
	public void push(BinaryTree val){
		Node newNode=new Node(val);
		newNode.next=top;
		top=newNode;
	}
	public BinaryTree peek(){
		return top.data;
	}
	BinaryTree pop(){
		BinaryTree delData=top.data;
		top=top.next;
		return delData;
	}
}
