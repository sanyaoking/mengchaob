package com.printSql.mengchaob;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.printSql.mengchaob")
public class MengchaobApplication {

	public static void main(String[] args) {
		SpringApplication.run(MengchaobApplication.class, args);
	}

}
