package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//благодаря тому что мы импортировали spring context мы можес обращаться к ClassPathXmlApplicationContext
public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestBean testBean = context.getBean("testBean", TestBean.class); // указываем обьект какого класса мы хотим получить, в нашем случае объект класса TestBean
        System.out.println(testBean.getName());
        context.close();
    }
}
