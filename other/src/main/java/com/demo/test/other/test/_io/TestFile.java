package com.demo.test.other.test._io;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("g:12345.xml");
		System.out.println(f.length());
	}

}
