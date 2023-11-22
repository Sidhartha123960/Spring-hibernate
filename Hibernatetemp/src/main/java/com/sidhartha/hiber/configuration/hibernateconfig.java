package com.sidhartha.hiber.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class hibernateconfig 
{ 
	 @Bean
	 public HibernateTemplate template(LocalSessionFactoryBean session)
	 {
         return new HibernateTemplate(session.getObject());
	 }
	  
	    @Bean
	    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource);
	        sessionFactory.setPackagesToScan("com.sidhartha.hiber.entity"); // Replace with your entity package
	        sessionFactory.setHibernateProperties(hibernateProperties());
	        return sessionFactory;
	    }
	 
	    private Properties hibernateProperties() {
	        Properties properties = new Properties();
	        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	        properties.setProperty("hibernate.show_sql", "true");
	        properties.setProperty("hibernate.hbm2ddl.auto", "update");
	        return properties;
	    }
	    		
}