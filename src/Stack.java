
public class Stack {
    int size=0;
	class Node{
		BinaryTreeNode data;
		Node next;
		public Node(BinaryTreeNode val){
			data=val;
		}
	}
	Node top=null;
	public void push(BinaryTreeNode val){
		Node newNode=new Node(val);
		newNode.next=top;
		top=newNode;
        size++;
	}
	public BinaryTreeNode peek(){
		return top.data;
	}
	BinaryTreeNode pop(){
		BinaryTreeNode delData=top.data;
		top=top.next;
        size--;
		return delData;
	}
	boolean isEmpty(){
		return top==null;
	}
}
