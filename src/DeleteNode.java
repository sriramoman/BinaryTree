/**
 * Created by sriram on 10/15/16.
 */
public class DeleteNode {
    public static void main(String[] args){
        BinaryTreeNode tree = BinaryTree.create();
        System.out.println(search(tree,9));
    }
    public static void deleteNode(BinaryTreeNode root,int data){
        if (root==null)
            return;
        BinaryTreeNode delNode = search(root,data);
        deepDelete(root);
    }
    public static BinaryTreeNode search(BinaryTreeNode root,int data){
        if (root==null)
            return null;
        if (root.data==data)
            return root;
        BinaryTreeNode left=search(root.left,data);
        if (left!=null)
            return left;
        else
            return search(root.right,data);
    }
    public static void deepDelete(BinaryTreeNode root){
//        if (root.left==null&&root.right==null)
//            return root;
//        if (root.left!=null)
//            return depthFind(root.left);
//        return depthFind(root.right);
    }
}
