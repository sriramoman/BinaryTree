
public class SearchElementInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = BinaryTree.create();
		System.out.println(searchElementFor(17,root));
	}
	private static boolean searchElementFor(int i, BinaryTreeNode root) {
		// TODO Auto-generated method stub
		if(root==null){
			return false;
		}
		else if(root.data==i){
			return true;
		}
		else{
			return searchElementFor(i,root.left) || searchElementFor(i,root.right);
		}
	}
}
