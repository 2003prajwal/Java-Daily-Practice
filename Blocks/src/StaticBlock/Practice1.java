package StaticBlock;

public class Practice1 {
	static int x = 10;
	static {
		System.out.println("Static Block 1: " + x);
		x = 20;
	}
	{
		System.out.println("Instance Block: " + x);
		x = 30;
	}

	Practice1() {
		System.out.println("Constructor: " + x);
	}

	static {
		System.out.println("Staitc Block 2: " + x);
		x = 40;
	}

	public static void main(String[] args) {
		System.out.println("Main Start: "+x);
		Practice1 p1 = new Practice1();
		System.out.println("After Object: " + x);
	}
}
