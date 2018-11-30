package test;

import test.outerInter.Outer;
public class TestOtherPackageOuter {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inter inter =  new Outer().new Inter();
//!		Outer2.Inter inter2 = new Outer2().new Inter();
	}

}
