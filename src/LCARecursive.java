/**
 * Created by sriram on 10/15/16.
 */
public class LCARecursive {
    public static void main(String args[]){
        BinaryTreeNode treeNode=BinaryTree.create();
        System.out.println(LCA(treeNode,12,10));
    }
    public static BinaryTreeNode LCA(BinaryTreeNode root,int d1,int d2){
        if (root==null)
            return null;
        if(root.data==d1 || root.data==d2)
            return root;
        BinaryTreeNode left = LCA(root.left,d1,d2);
        BinaryTreeNode right=LCA(root.right,d1,d2);
        if (left!=null && right!=null)
            return root;
        else if (left!=null)
            return left;
        else return right;
    }
}
