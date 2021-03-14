package org.example.test.other.test._utils;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TestZip {
	public static void testZip(String... args) throws IOException {
		FileOutputStream f = new FileOutputStream("h:com.demo.test.test.zip");
		CheckedOutputStream csum =
		new CheckedOutputStream(f, new Adler32());
		ZipOutputStream zos = new ZipOutputStream(csum);
		BufferedOutputStream out =
		new BufferedOutputStream(zos);
		    //setComment-->设置zip文件的注释
		zos.setComment("A com.demo.test.test of Java Zipping");
		// No corresponding getComment(), though.
		for(String arg : args) {
		System.out.println("Writing file " + arg);
		BufferedReader in =
		new BufferedReader(new FileReader(arg));
		zos.putNextEntry(new ZipEntry(arg));
		int c;
		while((c = in.read()) != -1)
		out.write(c);
		in.close();
		out.flush();
		}
		out.close();

	}
	public static void test01() throws FileNotFoundException, IOException {
		GZIPOutputStream zo = new GZIPOutputStream(new FileOutputStream("h:com.demo.test.test.zip"));
		GZIPInputStream zi = new GZIPInputStream(new FileInputStream("h:com.demo.test.test.zip"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(zi));
		
		FileInputStream fi = new FileInputStream(new File("h:com.demo.test.test.txt"));
		
		
		try {
			int i;
			
			while(-1!=( i=fi.read())) {
				zo.write(i);
			}
			fi.close();
			zo.close();
			String str = "";
			while(null!=(str=br.readLine())) {
				System.out.println(str);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) throws IOException {
		testZip("h:read.txt");
		
		
	}

}
