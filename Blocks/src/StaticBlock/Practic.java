package StaticBlock;

public class Practic {
	int j;
	Practic(){
		System.out.println("Constructor");
		int i = m1();
		j = m1();
	}
	

	static {
		System.out.println("Static Block");
	}
	
	 int m1() {
		System.out.println("Method m1");
		return 10;
	}
	 int ii = m1();
	 public static void main(String[] args) {
		 
		Practic p = new Practic();
		
		System.out.println("ok");
		
		System.out.println(p.ii);
		System.out.println(p.j);
		
	}
}
