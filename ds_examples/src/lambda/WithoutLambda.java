package lambda;

public class WithoutLambda {

	public static void main(String[] args) {
		Drawable d= new Drawable() {
			int width=90;
			@Override
			public void draw() {
				System.out.println(width);
				
			}
		};
		d.draw();

	}

}
interface Drawable{
	public void draw();
}