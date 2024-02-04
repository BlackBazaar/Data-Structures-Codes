package Binary_Tree;

public class BinaryNodeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryNodeOperations myBT=new BinaryNodeOperations();
		BinaryNode bt2= new BinaryNode(2,null,null);
		BinaryNode bt7= new BinaryNode(7,null,null);
		BinaryNode bt9= new BinaryNode(9,null,null);
		BinaryNode bt6= new BinaryNode(6,null,null);
		BinaryNode bt5= new BinaryNode(5,null,null);
		BinaryNode bt11= new BinaryNode(11,null,null);
		BinaryNode bt3= new BinaryNode(3,null,null);
		myBT.root=bt2;
		bt2.left=bt7;
		bt2.right=bt9;
		bt7.left=bt3;
		bt7.right=bt6;
		bt6.left=bt5;
		bt6.right=bt11;
		
		myBT.preorder(myBT.root);
		System.out.println();
		
		myBT.inorder(myBT.root);
		System.out.println();
		
		myBT.postorder(myBT.root);
		System.out.println();
		
		int max=myBT.findMax(myBT.root);
		System.out.println("max is: "+max);
		
		System.out.println("leaf count is: "+ getLeafCount(myBT.root));
		
		System.out.println("max height is: "+ maxHeight(myBT.root));
		
	}
	
	static int getLeafCount(BinaryNode n) {
		   if(n == null) return 0;
		   if(n.left == null && n.right == null) return 1;
		   else return getLeafCount(n.left)
		               + getLeafCount(n.right);
	}
	
	static int maxHeight(BinaryNode n) {
		  if(n == null) return -1;
		  
		  int lHehight = maxHeight(n.left);
		  int rHeight = maxHeight(n.right);
  
		  return Integer.max(lHehight, rHeight) +1;
	}



}
