/**
 * Created by sriram on 10/15/16.
 */
public class Test {
    public static void main(String[] args){
        BinaryTreeNode root = BinaryTree.create();
        System.out.println(root);
        delete(root);
        System.out.println(root);
        root=deleteProper(root);
        System.out.println(root);
    }
    public static void delete(BinaryTreeNode root){
        root=null;
    }

    public static BinaryTreeNode deleteProper(BinaryTreeNode root){
        root= null;
        return root;
    }


}
