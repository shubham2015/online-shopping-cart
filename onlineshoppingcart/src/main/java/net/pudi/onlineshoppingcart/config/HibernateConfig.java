package net.pudi.onlineshoppingcart.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"net.pudi.onlineshoppingbackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	private final static String DATABASE_URL = "jdbc:mysql://localhost:3307/test";
	private final static String DATABASE_DRIVER = "com.mysql.jdbc.Driver";
	private final static String DATABASE_DIALECT ="org.hibernate.dialect.MySQLDialect";
	private final static String DATABASE_USERNAME = "root";
	private final static String DATABASE_PASSWORD ="";

   @Bean("dataSource")
   public DataSource getDataSource() 
   {
	   BasicDataSource dataSource = new BasicDataSource();
	   dataSource.setDriverClassName(DATABASE_DRIVER);
	   dataSource.setUrl(DATABASE_URL);
	   dataSource.setUsername(DATABASE_USERNAME);
	   dataSource.setPassword(DATABASE_PASSWORD);
	   System.out.println();
	   System.out.println(dataSource.getUrl());
	   return dataSource;
	   
   }
   //Session Factory
   
   @Bean
   public SessionFactory getSessionFactory(DataSource dataSource)
   {
	   LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
       builder.addProperties(getHibernateProperties());
       builder.scanPackages("net.pudi.onlineshoppingbackend.dto");
	   return builder.buildSessionFactory();
   }
   
   //Method will return  all the hibernate properties
public Properties getHibernateProperties() {
	
	Properties properties = new Properties();
	properties.put("hibernate.dialect", DATABASE_DIALECT);
	
	properties.put("hibernate.show_sql", "true");
	properties.put("hibernate.format_sql", "true");
	//properties.put("hibernate.hbm2ddl.auto","update");
	return properties;
}
@Bean
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	return transactionManager;
}
}
