package ECommerce.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

public class DBConfig {
	
	@Bean(name= "dataSource")
	
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl(null);
		dataSource.setUsername(null);
		dataSource.setPassword(null);
		
		System.out.println("-----------DataSource Object is Created----------");
		
		
		
		return dataSource;
		
	}
	
	@Bean(name= "sessionFactory")
	
	public SessionFactory getSessionFactory() {
		
		Properties hibernateProp = new Properties();
		
		hibernateProp.put("hibernateProp.hdm2dd1.auto", "update");
		hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	
		
		LocalSessionFactoryBuilder localFactory = new LocalSessionFactoryBuilder(getH2DataSource());
		
		localFactory.addProperties(hibernateProp);
		
		
		
		
		
		System.out.println("--------SessionFactory Object is Created-----------");	
		
		return localFactory.buildSessionFactory();
		
		
	}
	
	
	@Bean(name="txManager")
	
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		
	System.out.println("----------Transaction Manager Object Created--------------");
	return new HibernateTransactionManager();
	
	}
	

}
