package test.lang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestRunTime {
    public static void main(String[] args) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
            
        }).start();
        long time = Runtime.getRuntime().totalMemory();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("加入关闭钩子");
            }
        });
        System.out.println(Runtime.getRuntime().totalMemory());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.err.println(sdf.format(time));
        System.out.println(Calendar.getInstance(Locale.CHINA).getTime());
    }

}
