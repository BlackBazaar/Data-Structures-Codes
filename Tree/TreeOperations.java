package Tree;

public class TreeOperations {
	TreeNode root;
	
	public TreeOperations() {
		root = null;
	}

	public void listAll (TreeNode eleman, int depth)
	{	 
		TreeNode temp=eleman;

	     for(int i=0;i<depth;i++) System.out.print("\t");
	     System.out.println(temp.directory_name);
	     //System.out.println();
	     if (eleman.firstChild!=null) {
	    	 temp=eleman.firstChild;
	     	 while(temp!=null) {
	     		listAll(temp,depth+1);
	     		temp=temp.nextSibling; 
	     	 }
	     }
	}
	
	int total_size=0;
	public int listAllSizes(TreeNode eleman)
	{
		int size=eleman.directory_size;
		total_size=total_size+size;
		System.out.println(eleman.directory_name+":"+size);
		if(eleman.firstChild!=null)
		{
			TreeNode temp=eleman.firstChild;

			while(temp!=null)
			{
				listAllSizes(temp);
				temp=temp.nextSibling;
			}
		}
		return total_size;
	}
}
