package Owner;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int totalLandMass = 0;
		int landSold = 0;
		OwnerClass owner = new OwnerClass();
		Shape rectangle = new Rectangle();
		rectangle.computeArea();
		Shape square = new Square();
		square.computeArea();
		Shape Triangle = new Triangle();
		owner.add(rectangle);
		owner.add(square);
		owner.add(Triangle);
		owner.remove(1);
		System.out.println(owner.calculateLandMass());
	}
}
