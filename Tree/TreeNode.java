package Tree;

public class TreeNode {
	
	     String directory_name ;
	     int directory_size;
	     TreeNode firstChild;
	     TreeNode nextSibling; 
	     public TreeNode(String directory_name,int directory_size,TreeNode firstChild,TreeNode nextSibling) {
	    	 this.directory_name=directory_name;
	    	 this.directory_size=directory_size;
	    	 this.firstChild=firstChild;
	    	 this.nextSibling=nextSibling;
	    	 
	     }

}
