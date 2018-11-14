package com.yy.msoc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("com.yy.msoc.dao")
public class MsocApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsocApplication.class, args);
	}
}
