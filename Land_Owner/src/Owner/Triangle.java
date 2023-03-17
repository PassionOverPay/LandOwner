package Owner;

public class Triangle implements Shape {
	private int height = 2, side = 2; 
	@Override
	public int computeArea() {
		return (height * side)/2;
	}

}
