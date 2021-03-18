package org.example.test.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author guitongZhang
 * @date 2021/03/17 22:09
 */
public class TraceUtils {

    public static void trace(Class<?> clazz) {
        loop(null, clazz);
    }

    public static void loop(Object obj, Class<?> clazz) {
        loop(obj, clazz, 5000);
    }

    @SuppressWarnings("all")
    public static void loop(Object obj, Class<?> clazz, long sleep) {

        while (true) {
            try {
                Method main = clazz.getMethod("main", String[].class);
                main.invoke(obj, (Object) new String[]{});
                Thread.sleep(sleep);
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
