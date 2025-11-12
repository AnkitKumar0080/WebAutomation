package Practice;

import org.testng.annotations.Test;

public class StringTest {
	float f;
	String s;
	int p;
	char cc;
	public static void main(String args[]) {
		test();
	}
	@Test
	public void reverse() {
		String s1 = "I love to code";
		//reverse word
		cc='c';
		int i1=5;
		double d = i1;
		int j =(int)d;
		String[] s2 = s1.split(" ");
		String result="";
		for(int i=s2.length-1;i>=0;i--) {
			result=result+" "+s2[i];
		}
		System.out.println(result + f + s+p+cc);
	}
	public static void test() {
		System.out.println("Static method");
	}
}
