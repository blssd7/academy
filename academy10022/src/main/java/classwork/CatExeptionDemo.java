package classwork;

import java.net.BindException;

public abstract class CatExeptionDemo {
public static void main(String[] args) {
	Cat  cat = new Cat(13, "������");
	catThrowException(cat);
	try {
		catThrowException(cat);
		System.out.println("��� �����");
	}catch (CatException 0); {
		System.out.println("��� �� ����� �����");
		
	}
	System.out.println("������");
}

public abstract void catThrowException(Cat cat) {
