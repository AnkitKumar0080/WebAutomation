package Practice;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class HelloWorld {
	int a;
	
	public static void main(String[] args) throws FileNotFoundException {
		HelloWorld hw = new HelloWorld();
		hw.test();
		int r=5;
		String s="Welcome";
		String t = new String("Welcome");
		System.out.println(s==t);
		System.out.println((s==t.intern())+" --> internmethod");
			
		System.out.println("Hello World" );
	}
	
	@Test
	public void test() {
		System.out.println("Test");
		int a=5;
		int b=0;
		try
		{try {
			int c=a+b;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch block executed"+e);
		}}
		catch(Exception e) {System.out.println(e);
		}
		
		finally{
			System.out.println("finally block executed");
		}
	}
	{
		a=3;
		System.out.println("Instance initializer block");
	}
}
