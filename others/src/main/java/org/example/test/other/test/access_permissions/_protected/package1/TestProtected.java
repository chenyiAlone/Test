package org.example.test.other.test.access_permissions._protected.package1;

import org.example.test.other.test.access_permissions._protected.package2.Aprotected;

public class TestProtected {
	public static void main(String[] args) {
		class Bprotected extends Aprotected {
			@Override
			protected void play() {
				super.play();
			}
		}
		Bprotected b = new Bprotected();
		b.play();
//!		b.com.demo.test.test();
	}

}

class Protected{
	
}
