package test._class;
/**
 * 
 * ����Class: T cast(Object o)����ת��
 * @author chenyiAlone
 *
 */
public class TestCast {
    public static void main(String[] args) {
        Base b = new Implem();
        System.out.println(b.getClass().getName());
        System.out.println(Implem.class.cast(b).getClass());
        // ��ʵ�����൱��(A)B����ǿ������ת��
        test(Implem.class.cast(b));
    }
    static void test(Implem i) {
        
    }

}
class Base{}
class Implem extends Base{}