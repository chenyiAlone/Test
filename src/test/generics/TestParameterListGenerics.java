package test.generics;

import java.util.ArrayList;
import java.util.List;

public class TestParameterListGenerics {
    public static void test(List<Food> fList) { // ������Ϊ����ָ����������
        
    }
    public static void main(String[] args) {
//!        test(new ArrayList<Water>());    // ��䲢����ͨ�����룬�޷�����ӵ�з�ָ�����͵�����
    }
}
interface Food {}
class Water implements Food {}