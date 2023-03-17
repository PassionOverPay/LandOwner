package Owner;

public class Cirle implements Shape {
	private int radius;
	@Override
	public int computeArea() {
		return radius*radius*3;
	}

}
