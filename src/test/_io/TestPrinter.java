package test._io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrinter {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("h:/test.txt");
		PrintStream ps= new PrintStream(new FileOutputStream(f,true),false);
		byte[] b = "1111fd11111\n".getBytes();
		try {
			ps.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
