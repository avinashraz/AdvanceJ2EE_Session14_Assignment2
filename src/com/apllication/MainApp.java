package com.apllication;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
Apllication app = (Apllication)context.getBean("app");
app.setName("Avinash");
app.getName();

	}

}
