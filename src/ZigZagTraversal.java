/**
 * Created by sriram on 10/15/16.
 */
public class ZigZagTraversal {
    public static void main(String[] args){
        BinaryTreeNode treeNode=BinaryTree.create();
        traverse(treeNode);
    }
    public static void traverse(BinaryTreeNode root){
        boolean reverse=true;
        Queue q=new Queue();
        q.enq(root);
        q.enq(null);
        Stack stk=new Stack();
        while (q.size!=0){
            root=q.deq();
            if(root!=null&& reverse==true)
                System.out.println(root);
            if (root==null){
                if(reverse){
//                    System.out.println("Stack");
                    while (!stk.isEmpty()){
//                        stk.pop();
                        System.out.println(stk.pop());
                    }
//                    System.out.println("Queue");
                }
                reverse=reverse?false:true;
                if (q.size!=0)
                    q.enq(null);
            }
            else {
                if (root.left!=null) {
                    q.enq(root.left);
                    if (reverse)
                        stk.push(root.left);
                }
                if(root.right!=null) {
                    q.enq(root.right);
                    if (reverse)
                        stk.push(root.right);
                }
            }
        }
    }
}
