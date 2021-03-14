package com.example.iterview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan()
@SpringBootApplication
public class IterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(IterviewApplication.class, args);
	}

}
