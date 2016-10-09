
public class RecursiveTreeTraversals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode tree = BinaryTree.create();
		postorderTraverse(tree);
	}
	public static void inorderTraverse(BinaryTreeNode tree){
		if(tree==null)
			return;
		inorderTraverse(tree.left);
		System.out.println(tree);
		inorderTraverse(tree.right);
	}
	public static void preorderTraverse(BinaryTreeNode tree){
		if(tree==null)
			return;
		System.out.println(tree);
		preorderTraverse(tree.left);
		preorderTraverse(tree.right);
	}
	public static void postorderTraverse(BinaryTreeNode tree){
		if(tree==null)
			return;
		postorderTraverse(tree.left);
		postorderTraverse(tree.right);
		System.out.println(tree);
	}

}
