package Tree;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeOperations myTree=new TreeOperations();
		TreeNode marks= new TreeNode("Marks",5,null,null);
		TreeNode books= new TreeNode("Books",6,null,null);
		TreeNode courses= new TreeNode("Courses",7,null,null);
		TreeNode data_structure= new TreeNode("Data_Structure",8,null,null);
		TreeNode login= new TreeNode("Login",9,null,null);
		TreeNode session= new TreeNode("Session",10,null,null);
		TreeNode user_name= new TreeNode("User_name",11,null,null);
		
		myTree.root=marks;
		marks.firstChild=books;
		books.nextSibling=courses;
		courses.firstChild=data_structure;
		courses.nextSibling=login;
		login.firstChild=session;
		session.nextSibling=user_name;
		
		myTree.listAll(myTree.root, 0);
		
		int total_size=myTree.listAllSizes(myTree.root);
		
		System.out.println("total_size: "+ total_size);
	}

}
