
public class NonRecursiveTraversals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode tree = BinaryTree.create();
		inorderTraversal(tree);
	}
	public static void inorderTraversal(BinaryTreeNode root){
		Stack stk = new Stack();
		while(true){
			while(root!=null){
				stk.push(root);
				root=root.left;
			}
			if(stk.isEmpty())
				break;
			System.out.println(stk.peek());
			root=stk.pop().right;
		}
	}
}
