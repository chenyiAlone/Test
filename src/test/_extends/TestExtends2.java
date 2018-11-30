package test._extends;

public class TestExtends2 {
    public static void main(String[] args) {
        new ExtendsClass().test();
        
    }

}
class SimClass{
    public void test() {
        System.out.println("SimClass.test()");
    }
}
class ExtendsClass extends SimClass{
    @Override
    public void test() {
        super.test();
        System.out.println("ExtendsClass.test()");
    }
}