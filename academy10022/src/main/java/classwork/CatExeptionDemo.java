package classwork;

import java.net.BindException;

public abstract class CatExeptionDemo {
public static void main(String[] args) {
	Cat  cat = new Cat(13, "Васька");
	catThrowException(cat);
	try {
		catThrowException(cat);
		System.out.println("Кот живой");
	}catch (CatException 0); {
		System.out.println("Кот не очень живой");
		
	}
	System.out.println("Лалала");
}

public abstract void catThrowException(Cat cat) {
