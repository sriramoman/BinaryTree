/**
 * Created by sriram on 10/15/16.
 */
public class HeightOfBinaryTreeLevelOrder {
    public static void main(String[] args){
        BinaryTreeNode tree = BinaryTree.create();
        System.out.println(height(tree));
    }
    public static int height(BinaryTreeNode root){
        Queue q = new Queue();
        q.enq(root);
        q.enq(null);
        int level=0;
        while (q.size!=0){
            root=q.deq();
            if(root==null){
                if (q.size!=0)
                    q.enq(null);
                level++;
            }
            else {
                if (root.left!=null)
                    q.enq(root.left);
                if (root.right!=null)
                    q.enq(root.right);
            }
        }
        return level;
    }
}
