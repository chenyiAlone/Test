package org.example.test.javase.spi;


import lombok.extern.slf4j.Slf4j;
import org.example.test.utils.TraceUtils;
import org.junit.Test;

/**
 * @author guitongZhang
 * @date 2021/03/15 23:02
 */
@Slf4j
public class MainTest {

    @Test
    public void testMain() {
        TraceUtils.trace(Main.class);
    }

}