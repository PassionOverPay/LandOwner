package Owner;

public class Rectangle implements Shape {
	private int width = 3;
	private int length = 4;

	@Override
	public int computeArea() {
		return width * length;
	}

}
