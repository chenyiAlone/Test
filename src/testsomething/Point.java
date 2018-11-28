package testsomething;

public class Point {
    private static class Node{
       String str;
       public Node(String str) {
           this.str =str;
       }
//       @Override
//        public String toString() {
//            // TODO Auto-generated method stub
//            return str.toString();
//        }
    }
    public static void point(Node n) {
        n = new Node("2");
        System.out.println(n);
    }
    public static void main(String[] args) {
        Node n = new Node("1");
        point(n);
        System.out.print(n);
    }

}
