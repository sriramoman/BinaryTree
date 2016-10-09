
public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = null;
		root=insert(root,10);
		root=insert(root,5);
		//root=insert(root,12);
		root=insert(root,4);
		//root=insert(root,6);
		root=insert(root,3);
		inorderTraverse(root);
	}
	public static BinaryTreeNode insert(BinaryTreeNode root,int val){
		if(root==null)
			return new BinaryTreeNode(val);
		if(val<root.data)
			root.left=insert(root.left,val);
		else
			root.right=insert(root.right,val);
		return root;
	}
	public static void inorderTraverse(BinaryTreeNode root){
		if(root==null)
			return;
		inorderTraverse(root.left);
		System.out.println(root);
		inorderTraverse(root.right);
	}
}
