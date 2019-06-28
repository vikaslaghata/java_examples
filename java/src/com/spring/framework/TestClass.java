package com.spring.framework;

import com.spring.framework.bean.StudentBean;
import com.spring.framework.conf.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

    @Autowired
    private StudentBean bean;



    private void printStudentName(){
        System.out.println(bean.getName()+" and "+bean.getType());
    }

    public static void main(String args[]){
       // TestClass testClass = new TestClass();
      //  testClass.printStudentName();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentBean bean = context.getBean("studentBean", StudentBean.class);
        System.out.println(bean.getName()+" : "+bean.getType()+" : "+bean.getAddress());
    }
}
