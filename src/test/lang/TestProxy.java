package test.lang;

public class TestProxy {
    static class InnerClass{
        public static void main(String[] args) {
            System.out.println(new InnerClass().getClass().getName());
        }
    }

}
class SonClass extends TestProxy{
    public static void main(String[] args) {
        System.out.println(new SonClass().getClass().getName());
        
    }
}