package oops;

public class Singelton {
	//Make a constructor private.
	//Write a static method that has the return type object of this singleton class.
	//Here, the concept of Lazy initialization is used to write this static method.

	 private static Singelton single_instance = null;
	 private static String s;
	public static Singelton fun(String s1) {
		if (single_instance == null) {
			single_instance=new Singelton();
		}
		s=s1;
		return single_instance;
		
	}
	private Singelton() {
		s="hello";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singelton o= Singelton.fun("hi bye");
		System.out.println(o.s);
	}

}
