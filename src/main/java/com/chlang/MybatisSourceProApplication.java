package com.chlang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.chlang.mapper")
public class MybatisSourceProApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSourceProApplication.class, args);
	}

}
