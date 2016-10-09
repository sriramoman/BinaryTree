
public class BinaryTreeNode {
	BinaryTreeNode left;
	BinaryTreeNode right;
	int data;
	public BinaryTreeNode(int val){
		left=right=null;
		data=val;
	}
	public BinaryTreeNode(){
		left=right=null;
	}
	public String toString(){
		return String.valueOf(this.data);
	}
}
