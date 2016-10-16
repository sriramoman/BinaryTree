/**
 * Created by sriram on 10/15/16.
 */
public class CreateBTInorderPostorder {
    //Given the string representing inorder and postorder traversal each, create a binary tree
    public static void main(String[] args){
        int[] inorder=new int[]{4,2,5,1,6,3,7};
        int[] postorder = new int[]{4, 5, 2, 6, 7, 3, 1};
        BinaryTreeNode tree = buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
        inorderTraverse(tree);
    }

    public static BinaryTreeNode buildTree(int[] inorder,int inorderStart,int inorderEnd,
                                           int[] postorder,int postorderStart,int postorderEnd){
        if (inorderStart>inorderEnd || postorderStart>postorderEnd)
            return null;
        int search=postorder[postorderEnd];
        BinaryTreeNode root = new BinaryTreeNode(search);
        int currIndex=0;
        int offset=0;
        for (int i=inorderStart;i<=inorderEnd;i++) {
            if (inorder[i] == search) {
                currIndex = i;
//                offset++;
                break;
            }
            offset++;
        }
        root.left=buildTree(inorder,inorderStart,currIndex-1,postorder,postorderStart,postorderStart+offset-1);
        root.right=buildTree(inorder,currIndex+1,inorderEnd,postorder,postorderStart+offset,postorderEnd-1);
        return root;
    }
    public static void inorderTraverse(BinaryTreeNode tree){
        if(tree==null)
            return;
        inorderTraverse(tree.left);
        System.out.println(tree);
        inorderTraverse(tree.right);
    }
}
