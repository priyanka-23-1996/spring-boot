package lambda;

public class WithLambda {

	public static void main(String[] args) {
		int width=80;
		Draw d = ()->{
			System.out.println(width);
		};
		d.draw();

	}

}

@FunctionalInterface
interface Draw{
	public void draw();
}