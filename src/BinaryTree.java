
public class BinaryTree {
	public static BinaryTreeNode create(){
		BinaryTreeNode one=new BinaryTreeNode(1);
		BinaryTreeNode two = new BinaryTreeNode(2);
		BinaryTreeNode three=new BinaryTreeNode(3);
		BinaryTreeNode four=new BinaryTreeNode(4);
		BinaryTreeNode five=new BinaryTreeNode(5);
		BinaryTreeNode six=new BinaryTreeNode(6);
		BinaryTreeNode seven=new BinaryTreeNode(7);
		BinaryTreeNode eight=new BinaryTreeNode(8);
		BinaryTreeNode nine=new BinaryTreeNode(9);
		BinaryTreeNode ten=new BinaryTreeNode(10);
		BinaryTreeNode eleven=new BinaryTreeNode(11);
		BinaryTreeNode twelve=new BinaryTreeNode(12);
		one.left=two;
		one.right=seven;
		two.left=three;
		two.right=four;
		seven.right=eight;
		four.left=five;
		five.left=six;
		eight.left=nine;
		eight.right=ten;
		nine.left=eleven;
		eleven.left=twelve;
		return one;
	}
}
