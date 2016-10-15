/**
 * Created by sriram on 10/15/16.
 */
public class HeightOfBinaryTreeStack {
    public static void main(String[] args){
        BinaryTreeNode tree = BinaryTree.create();
        System.out.println(height(tree));
    }
    public static int height(BinaryTreeNode root){
        Stack stk = new Stack();
        stk.push(root);
        BinaryTreeNode prev=null;
        BinaryTreeNode curr;
        int height=0;
        while (!stk.isEmpty()){
            curr=stk.peek();
            if (prev==null || prev.left==curr || prev.right==curr){
                if (curr.left!=null)
                    stk.push(curr.left);
                else if (curr.right!=null)
                    stk.push(curr.right);
            }
            else if (prev==curr.left){
                if (curr.right!=null)
                    stk.push(curr.right);
            }
            else {
                stk.pop();
            }
            prev=curr;
            if (stk.size>height)
                height=stk.size;
        }
        return height;
    }
}
