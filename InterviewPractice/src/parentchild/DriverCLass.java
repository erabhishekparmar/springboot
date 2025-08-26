package parentchild;

public class DriverCLass {
	
	public static void main(String args[]) {
		Parent parent = new Child();
		parent.showParent();
		// we cannot call method of child from parent reference
		//show of Parent...
		
		Child child = new Child();
		child.showParent();
		child.showChild();
		
		/*
		show of Parent...
		show of Child...
		 */
		
		// Child c = new Parent(); // not allowed - compiler time error
		
	}
}
