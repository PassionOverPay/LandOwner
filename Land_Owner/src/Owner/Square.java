package Owner;

public class Square implements Shape {
	int length = 5;

	@Override
	public int computeArea() {
		return length * length;
	}

}
