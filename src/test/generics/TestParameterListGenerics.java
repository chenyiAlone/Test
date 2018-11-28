package test.generics;

import java.util.ArrayList;
import java.util.List;

public class TestParameterListGenerics {
    public static void test(List<Food> fList) { // 容器作为可以指定泛型类型
        
    }
    public static void main(String[] args) {
//!        test(new ArrayList<Water>());    // 这句并不能通过编译，无法传入拥有非指定泛型的容器
    }
}
interface Food {}
class Water implements Food {}