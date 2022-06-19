package ECommerce.config;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBConfig {
	
	@Bean(name= "dataSource")
	
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl
		dataSource.setUsername(null);
		dataSource.setPassword(null);
		
		System.out.println("-----------DataSource Object is Created----------");
		
		
		
		return dataSource;
		
	}

}
