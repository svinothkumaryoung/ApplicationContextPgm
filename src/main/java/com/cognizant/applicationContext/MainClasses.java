package com.cognizant.applicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClasses {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springData.xml");
        StudentInfo studentInfo=(StudentInfo) context.getBean("si");
        studentInfo.printData();
    }
}
