package BlockPkg;

public class InstanceBlock {
	{
		System.out.println("Instance Block");
	}
	
	InstanceBlock(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		InstanceBlock i = new InstanceBlock();
	}
}
//A block without static, written directly inside a class.
//Executes whenever an object is created, before the constructor.
//Instance Block is also called as Not static block