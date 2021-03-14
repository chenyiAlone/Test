package org.example.test.other.test._utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {
	public static void main(String[] args) {
	    
	    System.out.println("-1".matches("-?"));
	    
	}
	public static void testRegex() {
		Pattern p = Pattern.compile("abd");
		Matcher m = p.matcher("abda dfd abd");
		m.find();
		System.out.println(m.group());
		System.out.println(m.start());
		System.out.println(m.end());
//		m.reset();
		m.find();
		System.out.println(m.start());
		/*print:
			0
			3
		*/
	}

}
