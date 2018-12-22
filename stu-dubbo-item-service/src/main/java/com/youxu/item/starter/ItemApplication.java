package com.youxu.item.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * main方法启动dubbo
 * 不推荐使用
 * 不能使用dubbo的高级特性
 */
public class ItemApplication {


	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:spring/spring-context.xml"});
        context.start();
        // press any key to exit
        System.in.read();
	}

}
