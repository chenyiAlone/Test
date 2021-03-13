package com.demo.test.test._package.package2;

import com.demo.test.test._package.package1.TestInterface;

public class Test2 {
	protected class Inter implements TestInterface{
		public Inter() {}
		@Override
		
		public void play() {
			System.out.println("Inter implements TestInterface;");
		}
		
	}

}
