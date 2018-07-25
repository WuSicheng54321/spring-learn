package com.wusicheng.e001_helloworld.nevv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wsc
 * @date 2018/7/25
 * @description
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring-context.xml");
        Human human = (Human) context.getBean("human");
        human.drint();
    }
}
