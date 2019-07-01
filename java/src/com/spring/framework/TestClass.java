package com.spring.framework;

import com.spring.framework.bean.StudentBean;
import com.spring.framework.conf.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

    public static void main(String args[]){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentBean bean = context.getBean("studentBean", StudentBean.class);
        System.out.println(bean.getName()+" : "+bean.getType()+" : "+bean.getAddress());
    }
}
