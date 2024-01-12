package oops;

public class OOPS {

	
	public static void main(String[] args) {
		Base b=new Base();
		b.fun1();
		//b.fun2();
		Child c= new Child();
		c.fun1();
		c.fun2();

	}

}

 class Base{
	 public void fun1() {
			System.out.println("hello");
		}
 }
 class Child extends Base{
	  void fun2() {
		System.out.println("world");
	}
	
}
