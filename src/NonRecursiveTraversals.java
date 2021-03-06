
public class NonRecursiveTraversals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode tree = BinaryTree.create();
		preorderTraversal(tree);
//		inorderTraversal(tree);
//		postorderTraversal(tree);
        //levelorderTraversal(tree);
	}
	
	public static void inorderTraversal(BinaryTreeNode root){
		Stack stk = new Stack();
		while(true){
			while(root!=null){
				stk.push(root);
				root=root.left;
			}
			if(stk.isEmpty())
				break;
			System.out.println(stk.peek());
			root=stk.pop().right;
		}
	}
	
	public static void preorderTraversal(BinaryTreeNode root){
		Stack stk = new Stack();
		while(true){
			while(root!=null){
				System.out.println(root);
				if(root.right!=null)
					stk.push(root.right);
				root = root.left;
			}
			if(stk.isEmpty())
				break;
			root=stk.pop();
		}
	}
	
	
//	public static void preorderTraversal(BinaryTreeNode root){
//		Stack stk = new Stack();
//		stk.push(root);
//		while(!stk.isEmpty()){
//			while(root!=null){
//				System.out.println(root);
//				stk.push(root);
//				root=root.left;
//			}
//			root=stk.pop().right;
//		}
//	}

	public static void postorderTraversal(BinaryTreeNode root){
		Stack stk = new Stack();
        BinaryTreeNode prev=null;
		BinaryTreeNode curr = root;
        stk.push(curr);
        while (!stk.isEmpty()){
            curr=stk.peek();
            if (prev==null || curr==prev.right || curr==prev.left){
                if (curr.left!=null)
                    stk.push(curr.left);
                else if(curr.right!=null)
                    stk.push(curr.right);
            }
            else if (curr.left==prev){
                if(curr.right!=null)
                    stk.push(curr.right);
            }
            else {
                System.out.println(stk.pop());
            }
            prev=curr;
        }
	}

	public static void levelorderTraversal(BinaryTreeNode root){
        Queue queue = new Queue();
        queue.enq(root);
        while (queue.size!=0){
            root=queue.deq();
            System.out.println(root);
            if (root.left!=null)
                queue.enq(root.left);
            if (root.right!=null)
                queue.enq(root.right);
        }
    }
}
