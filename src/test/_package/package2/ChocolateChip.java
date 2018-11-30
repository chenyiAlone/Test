package test._package.package2;

import test._package2.Dad;

public class ChocolateChip extends Chip{
	public static void main(String[] args) {
		ChocolateChip chocolateChip = new ChocolateChip();
		chocolateChip.bake();
//		chocolateChip.f1();
//		chocolateChip.f2();
	//!	chocolateChip.f3();		不加访问权限修饰词的成员不能都被继承使用
	}
}
