package com.spring.framework.conf;

import com.spring.framework.bean.AddressBean;
import com.spring.framework.bean.StudentBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
    @Bean("studentBean")
    @Lazy(true)
    public StudentBean getStudentBean(){
        return new StudentBean("Some name");
    }

    @Bean("address")
    @Lazy(false)
    public AddressBean getAddressBean(){
        return new AddressBean("Some address");
    }


}
