package classwork;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Lesson15 {

	public static void main(String[] args) {
		try (OutputStream output = new FileOutputStream("cat1.txt");
				InputStream input = new FileInputStream("cat.txt")) {
			char[] symbols = {};
			for (int i = 0; i < symbols.length; i++) {
				output.write(input.read()+1);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
