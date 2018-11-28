package test.concurrency;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;




class MyDelay implements Delayed{

    @Override
    public int compareTo(Delayed o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
enum Times {
    SUBMIT_TIME(10), SUMBMIT_LIMIT(2), MAX_RAND_TIME(15);
    private final int value;

    private Times(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
/**
 * DelayQueueʵ�ֶ࿼������
 * @author Gss
 */
public class TestDelayedQueue {

    public static void main(String[] args) throws InterruptedException {
        DelayQueue<Student> queue = new DelayQueue<>();
        queue.add(new Student("������"));
        queue.add(new Student("��  ��"));
        queue.add(new Student("��һͩ"));
        queue.add(new Student("��С��"));
        queue.add(new Student("��  ��"));
        queue.add(new Student("�̾���"));
        queue.add(new Student("���"));
        queue.add(new Student("������"));
        queue.add(new Student("������"));
        queue.add(new Student("���»�"));
        queue.add(new Student("������"));
        queue.add(new Student("submit", Times.SUBMIT_TIME.getValue(), TimeUnit.SECONDS));
        while (true) {
            Student s = queue.take(); // ��Ҫʱ���������ȴ�
            if (s.getName().equals("submit")) {
                System.out.println("ʱ���ѵ���ȫ������");
                // ����Java8 Streamʹ��δ����ѧ������
                queue.parallelStream()
                     .filter(v -> v.getExpire() >= s.getExpire())
                     .map(Student::submit)
                     .forEach(System.out::println);
                System.exit(0);
            }
            System.out.println(s);
        }
    }

}

class Student implements Delayed {
    private String name;
    private long delay; // ���Ի���ʱ�䣬��λΪ����
    private long expire; // ����ʱ�䣬��λΪ����

    // �˹����������ɿ��Ի���ʱ��
    public Student(String name) {
        this.name = name;
        this.delay = TimeUnit.MILLISECONDS.convert(getRandomSeconds(), TimeUnit.SECONDS); // ������ɿ��Ի���ʱ��
        this.expire = System.currentTimeMillis() + this.delay;
    }

    // �˹����ָ�����Ի���ʱ��
    public Student(String name, long delay, TimeUnit unit) {
        this.name = name;
        this.delay = TimeUnit.MILLISECONDS.convert(delay, unit);
        this.expire = System.currentTimeMillis() + this.delay;
    }

    public int getRandomSeconds() { // ��ȡ�������ʱ��
        return new Random().nextInt(Times.MAX_RAND_TIME.getValue() - Times.SUMBMIT_LIMIT.getValue())
                + Times.SUMBMIT_LIMIT.getValue();
    }

    public Student submit() { // ���û���ʱ��ͽ���ʱ�䣬����ʱ�����ǿ�ƽ���ʱ���ô˷���
        setDelay(Times.SUBMIT_TIME.getValue(), TimeUnit.SECONDS);
        setExpire(System.currentTimeMillis());
        return this;
    }

    public String getName() {
        return name;
    }

    public long getExpire() {
        return expire;
    }

    public void setDelay(long delay, TimeUnit unit) {
        this.delay = TimeUnit.MILLISECONDS.convert(delay, TimeUnit.SECONDS);
    }

    public void setExpire(long expire) {
        this.expire = expire;
    }

    @Override
    public int compareTo(Delayed o) { // �˷�����ʵ�����ڶ������ȼ�
        long td = this.getDelay(TimeUnit.MILLISECONDS);
        long od = o.getDelay(TimeUnit.MILLISECONDS);
        return td > od ? 1 : td == od ? 0 : -1;
    }

    @Override
    public long getDelay(TimeUnit unit) { // ���ﷵ�ص���ʣ����ʱ������ʱΪ0ʱ����Ԫ����ʱ�������ɴ�take()ȡ��
        return unit.convert(this.expire - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return "ѧ��������" + this.name + ",������ʱ��" + TimeUnit.SECONDS.convert(delay, TimeUnit.MILLISECONDS) + ",����ʱ�䣺"
                + DateFormat.getDateTimeInstance().format(new Date(this.expire));
    }
}