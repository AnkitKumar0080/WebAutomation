package InheritanceTest;

public class ParentTest {
	int a,b,c;
	static int c2;
	static int a2=3;
	static int b2=5;
	
	
	ParentTest(){
		a=5;
		b=7;
		
	}
	
	public static void main(String args[]) {
		
	}
	public void add() {
		c=a+b;
		System.out.println(c);
	}
	public static void added() {
		c2=2*a2*b2;
		System.out.println(c2);
	}

}
