package testsomething;

public class ExtendMethods extends A {
    public void diffcultMethods() {
        try {
            System.out.println("ExtendMethods.diffcultMethods()!");
            return;
        } finally {
            super.easyMethod(); // ��ɶԻ��෽������չ
        }
    }
    public static void main(String[] args) {
        ExtendMethods em = new ExtendMethods();
        em.diffcultMethods();
        System.out.format("%s","ceshi");
    }
}
class A{
    public void easyMethod() {
        System.out.println("A.easyMethods()!");
    }
//    ArrayBlockingQueue;
}