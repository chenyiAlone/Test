package test.lang;

public class TestGc {
	
	public static void main(String[] args) {
		
		for(int i=0;i<1;i++) {
			GC gc = new GC();
			gc.play();
		}
//		System.gc();
		GC gc = new GC();
		gc.play();
	}
}


class GC{
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("�Ѿ�������");
	}
	public void play() {
		System.out.println("running---");
	}
	
}
