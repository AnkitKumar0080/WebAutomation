package Practice;

public class ConstructorTest {
	int age;
	String name;
	String sex;
	 ConstructorTest(String name, int age, String sex){
		 this.name=name;
		 this.age=age;
		 this.sex=sex;
		 
	 }
	 public String toString() {
		 return "Ankit";
	 }
	 public static void main(String args[]) {
		 ConstructorTest c1 = new ConstructorTest("Ankit",32,"Male");
		 System.out.println(c1);
		 String s2=c1.toString();
		 System.out.println(s2);
;
		 }

}
