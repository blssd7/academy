package classwork;

public class BirdDemo {

	public static void main(String[] args) {
		Bird b = new Bird("�������");
		Flyable f = bird -> System.out.println("������ " + bird.getName());
		f.fly(b);
	}

}
