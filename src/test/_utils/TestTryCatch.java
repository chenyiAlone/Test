package test._utils;

public class TestTryCatch {
    public static void main(String[] args) {
        f();
    }
    public static String f() {
        try {
            return "f()";
        } finally {
            System.out.println("finally{}");
        }
    }
}
