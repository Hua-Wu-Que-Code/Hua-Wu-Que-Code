package com.example.desigonpattern.factory.iocFactory.reflact;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author huawuque
 * @version 1.0
 * @project utils
 * @description 用来测试反射的类
 * @date 2023/3/1 21:05:09
 */
public class ReflectTest {
    private static Properties pros = null;
    private static HashMap<String,Person> map = null;

    static {
        pros = new Properties();
        map = new HashMap<String,Person>();
        InputStream inputStream = ReflectTest.class.getClassLoader().getResourceAsStream("beanFactory.properties");
        try {
            pros.load(inputStream);
            Set<Object> keys = pros.keySet();
            for (Object k:keys) {
                String ClassName =  pros.getProperty((String) k);
                Class Clazz = Class.forName(ClassName);
                Person p = (Person) Clazz.newInstance();
                p.setName("hello");
                p.setAge(18);
                map.put((String) k,p);
            }
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }



    }

    public static void main(String[] args) {
        System.out.println(map.get("person"));
    }

}
