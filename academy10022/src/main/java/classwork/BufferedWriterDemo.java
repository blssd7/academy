package classwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("src\\io\\buffwriter.txt");
				BufferedWriter br = new BufferedWriter(writer)) {
			br.write("Я люблю Java");

		} catch (IOException e) {
			System.out.println(e);
		}
		try (FileReader reader = new Filereader("src\\io\\buffwriter.txt");
				BufferedReader br = new BufferedReader(reader)) {
//			System.out.println(br.reader);

		}
	}
}