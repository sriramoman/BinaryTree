
public class FindMaxElementInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = BinaryTree.create();
		findMaxElementIn(root);
		System.out.println(max);
	}
	static int max=0;
	public static void findMaxElementIn(BinaryTreeNode node){
		if(node==null)
			return;
		if(node.data>max)
			max=node.data;
		findMaxElementIn(node.left);
		findMaxElementIn(node.right);
	}

}
