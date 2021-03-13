package com.demo.test.other.test._package.package2;

import com.demo.test.other.test._package.package1.TestInterface;

public class Test2 {
	protected class Inter implements TestInterface {
		public Inter() {}
		@Override
		
		public void play() {
			System.out.println("Inter implements TestInterface;");
		}
		
	}

}
