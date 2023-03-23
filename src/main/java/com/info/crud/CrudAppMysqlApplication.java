package com.info.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CrudAppMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppMysqlApplication.class, args);
	}

}
