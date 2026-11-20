package StaticBlock;

public class StaticBlock {
	 StaticBlock(){
		 System.out.println("Constructor");
	 }
	static {
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		StaticBlock c = new StaticBlock();
		
		System.out.println("Main Method");
		
	    StaticBlock c1 = new StaticBlock();
	}
}
//Declared using the static keyword.
//Purpose: Used for static initialization. It executes when the class is loaded.