package com.vikas.miniproject.spring.config;

import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value={
        @ComponentScan("com.vikas.miniproject.spring.dao"),
        @ComponentScan("com.vikas.miniproject.spring.service")
})
public class AppConfig {
    @Autowired
    private Environment env;

    @Bean
    public LocalSessionFactoryBean getSessionFactory(){
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        Properties props = new Properties();

        //Setting JDBC properties
        props.setProperty(org.hibernate.cfg.Environment.DRIVER, env.getProperty("mssql.driver"));
        props.setProperty(org.hibernate.cfg.Environment.URL, env.getProperty("mssql.url"));
        props.setProperty(org.hibernate.cfg.Environment.USER, env.getProperty("mssql.user"));
        props.setProperty(org.hibernate.cfg.Environment.PASS, env.getProperty("mssql.password"));

        //Setting hibernate properties
        props.setProperty(AvailableSettings.C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
        props.setProperty(AvailableSettings.C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
        props.setProperty(AvailableSettings.C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
        props.setProperty(AvailableSettings.C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));
        props.setProperty(AvailableSettings.C3P0_IDLE_TEST_PERIOD, env.getProperty("hibernate.c3p0.idle_test_period"));
        props.setProperty(AvailableSettings.C3P0_ACQUIRE_INCREMENT, env.getProperty("hibernate.c3p0.acquire_increment"));
        props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
        props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        //props.setProperty(AvailableSettings.C3P0_, env.getProperty("hibernate.c3p0.validate"));

        factoryBean.setHibernateProperties(props);
        factoryBean.setPackagesToScan("com.vikas.miniproject.spring.model"); // which packages Hibernate should scan for Entity classes

        return factoryBean;
    }
    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager manager = new HibernateTransactionManager();
        manager.setSessionFactory(getSessionFactory().getObject()); // call above method for session factory
        return manager;
    }

}
