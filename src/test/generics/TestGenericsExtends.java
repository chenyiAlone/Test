package test.generics;

/**
 * �̳�ʵ���˴��з��Ͳ����Ľӿڵĸ���ʱ������Ҫ���и���ʵ�ֵ��Ͳ��������ҿ��Լ����Լ������Ͳ���
 * @author chenyiAlone
 *
 * @param <T>
 * @param <E>
 * 
 * ��ϰ 11.28
 */
public class TestGenericsExtends<T, E> extends Generiscs {
    
}
// �̳�ʵ����Comparable�ӿڵ��಻���ٴ�ʵ�����������ɶԵ�ǰ���ֱ�ӱȽ�
//public class TestGenericsExtends extends Generiscs implements Comparable<TestGenericsExtends>{
    
//}
class Generiscs implements Comparable<Generiscs>{

    @Override
    public int compareTo(Generiscs o) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}