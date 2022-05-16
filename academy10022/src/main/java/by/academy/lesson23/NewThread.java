package by.academy.lesson23;

public class NewThread extends Thread {
	@Override
	public void run() {
		System.out.println();
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}
