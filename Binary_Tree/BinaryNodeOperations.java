package Binary_Tree;
public class BinaryNodeOperations {
	
	BinaryNode root;
	
	BinaryNodeOperations(){
		root=null;
	}
	
	void preorder(BinaryNode t){	//root left right 
		  if (t != null) {
				System.out.print(t.data);
				preorder(t.left);
				preorder(t.right);
		  }
		}
	
	void inorder(BinaryNode t){	 //left root right 
		  if (t != null) {
				inorder(t.left);
				System.out.print(t.data);
				inorder(t.right);
		  }
	}
	
	void postorder(BinaryNode t){	//left right root 
		  if (t != null) {
			  postorder(t.left);
			  postorder(t.right);
			  System.out.print(t.data);
		  }
	}
	
	int findMax(BinaryNode t) 
	{
	     
		int max = 0;
		if (t != null) {
	       max = t.data;  
	       int left = findMax(t.left);
			// Compare left against root
	       if (t.left != null && left>max)
	            max = left;
			int right = findMax(t.right);
			// Compare right against root
	       if (t.right != null 
				&& right>max)
	            max = right;
	   }
	   return max;
	}
	

}
