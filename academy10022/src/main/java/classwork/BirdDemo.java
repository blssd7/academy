package classwork;

public class BirdDemo {

	public static void main(String[] args) {
		Bird b = new Bird("Василий");
		Flyable f = bird -> System.out.println("Летает " + bird.getName());
		f.fly(b);
	}

}
