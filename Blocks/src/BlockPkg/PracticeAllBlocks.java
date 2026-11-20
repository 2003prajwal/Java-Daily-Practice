package BlockPkg;

public class PracticeAllBlocks {
	
	{
		System.out.println("Instance Block/ Non Static Block");
		int a = 1;
	}
	
	PracticeAllBlocks(){
		System.out.println("Constructor");
	}
	
	static {
		System.out.println("Static Block");

	}
	
	void display() {
		System.out.println("Method Block");
	}

	public static void main(String[] args) {
		{
			System.out.println("Local Block inside main method");
			int x = 10;
			
		}
		System.out.println("Main Method Block");
		//System.out.println(x); not allow

	}
	
}
