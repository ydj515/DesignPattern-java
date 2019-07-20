package composite_pattern_1;

public class Main {

	public static void main(String[] args) {

		Component rect1 = new Rect(10.0, 10.0);
		Component rect2 = new Rect(5.0, 10.0);
		Component tri1 = new Triangle(10.0, 10.0);

		System.out.println(rect1.size());

		rect1.addComponent(tri1); // component 추가

		Group group = new Group();
		group.addComponent(rect2); // component 추가
		group.addComponent(tri1); // component 추가

		System.out.println(group.size());
	}

}
