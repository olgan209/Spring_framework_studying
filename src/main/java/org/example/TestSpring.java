package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//благодаря тому что мы импортировали spring context мы можес обращаться к ClassPathXmlApplicationContext
public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
