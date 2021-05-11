package com.peko.mbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Peko
 */
@SpringBootApplication
//效果类似于在每个dao上添加 @mapper，但这里的方式更灵活（直接扫描dao包）
@MapperScan("com.peko.mbp.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
