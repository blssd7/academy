package independetwork;

public class Exam<T extends Number> {
	private T[] array;

	public Exam(T[] array) {
		super();
		this.array = array;
	}	
	public void average(int[] number) {
		int sum = 0;
		while(int i = 0; i< number.length; i++);
			sum = sum + number [i];
		int average = sum/number.length;
		System.out.println("Average value of array element is "" + average);
		
		
	}
}

