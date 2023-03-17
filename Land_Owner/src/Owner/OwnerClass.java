package Owner;

import java.util.ArrayList;

public class OwnerClass {
	private ArrayList<Shape> landsOwned = new ArrayList<Shape>();

	public int calculateLandMass() {
		int totalArea = 0;
		for (Shape shape : landsOwned) {
			totalArea += shape.computeArea();
		}
		return totalArea;
	}

	public boolean add(Shape e) {
		return landsOwned.add(e);
	}

	public Shape remove(int index) {
		return landsOwned.remove(index);
	}
}