package abs;

public class Test {

	public static void main(String[] args) {
		Shape s1 = new Circle("red",2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);

		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
