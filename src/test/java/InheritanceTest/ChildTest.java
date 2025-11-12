package InheritanceTest;

public class ChildTest extends ParentTest{
	int a,b,c;
	static int c2;
	static int a2=9;
	static int b2=5;
	ChildTest(){
		a=5;
		b=7;
		
	}
	
	public static void main(String args[]) {
		ParentTest test = new ChildTest();
		test.add();
		test.added();
		System.out.println(test instanceof ChildTest);
	}
	public void add() {
		c=a*b;
		System.out.println(c);
	}
	
}
