package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
    }
}
