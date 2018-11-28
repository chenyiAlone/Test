package test.generics;

public class Return<E> {
    public  E test(E e) {
        return e;
    }
    public static void printInt(int i) {
        System.out.println(i);
    }
    public static void main(String[] args) {
        Return<Integer> r = new Return<>();
        if (r.test(2) instanceof Integer) System.out.println(true);
        printInt(r.test(2));
    }
}
