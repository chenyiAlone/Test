package org.example.test.io.resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author guitongZhang
 * @date 2021/03/15 23:09
 */
@Slf4j
public class Resource {

    private static final String PREFIX = "META-INF/services/";


    /**
     * get Enumeration<URL> by ClassLoader#getSystemResources
     */
    @Test
    public void testGetResources() {
        Class<HelloService> clazz = HelloService.class;
        String className = clazz.getName();
        log.info(className);
        String fullName = PREFIX + className;

        Enumeration<URL> systemResources;
        try {
            systemResources = ClassLoader.getSystemResources(fullName);
            while (systemResources.hasMoreElements()) {
                log.info(systemResources.nextElement().toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * test get bufferReader by Url
     */
    @Test
    public void testResourceTransform() {
        Class<HelloService> clazz = HelloService.class;
        String className = clazz.getName();
        log.info(className);
        String fullName = PREFIX + className;

        Enumeration<URL> systemResources;
        try {
            systemResources = ClassLoader.getSystemResources(fullName);
            URL url = systemResources.nextElement();
            log.info(url.toString());

            InputStream in = url.openStream();
            BufferedReader r = new BufferedReader(
                new InputStreamReader(in, StandardCharsets.UTF_8));
            String line;
            line = r.readLine();
            log.info(line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
