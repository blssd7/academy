package classwork;

public class MilkProduct extends Product {
	private double fat;
	private int age;
	final int DATEAGE = 10;

	public MilkProduct() {
	}

	public MilkProduct(double fat, int age) {
		this.fat = fat;
		this.age = age;
	}

	public void print() {
		System.out.println(fat);
	}

	public void outOfDate() {
		if (age < DATEAGE)
			;
		System.out.println("nice");
	}

}
