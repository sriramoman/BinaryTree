import java.util.ArrayList;

/**
 * Created by sriram on 10/15/16.
 */
public class RootToLeafPaths {
    public static void main(String[] args){
        BinaryTreeNode treeNode = BinaryTree.create();
        String initialPath="";
        printPaths(initialPath,treeNode);
    }
    public static void printPaths(String currPath,BinaryTreeNode root){
        currPath+=root.data+" ";
        if (root.left==null && root.right==null) {
            System.out.println(currPath);
        }
        if (root.left!=null)
            printPaths(currPath,root.left);
        if(root.right!=null)
            printPaths(currPath,root.right);
    }
}
