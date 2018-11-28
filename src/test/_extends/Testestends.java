package test._extends;


public class Testestends {
	public static void main(String[] args) {
		Object obj = new Include().new Impl();
		System.out.println(obj);
	}
}

class Dad{
	final void play() {System.out.println(getClass().getName());}
}
class son extends Dad{
//	void play(){
//		
//	}
}


interface Base{
	public void f();
}

class Include{
	public class Impl implements Base{
		public Object to() {
			return Include.this;
		}
		@Override
		public void f() {
			System.out.println("Impl.f();");
		}
	}
}

class Exten extends Include{
	public Impl impl() {
		return this.new Impl();
	}
}