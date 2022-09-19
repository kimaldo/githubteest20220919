package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*  xml
 * <context:component-scan base-package=a.b.test">
 * @ComponentScan(basepackage="a.b.test")
 * 
 * 
 * */
@SpringBootApplication
//1. 스프링부트 시작 클래스 - tomcat 내장 시작(application.properties파일  server.port=8081)
@ComponentScan //현재 패키지 annotation인식
@ComponentScan(basePackages = "mycontroller")
@ComponentScan(basePackages = "upload")
@ComponentScan(basePackages = "board.spring.mybatis")
// @Mapper 스캔설정
@MapperScan(basePackages ="board.spring.mybatis" )
@MapperScan(basePackages = "upload")

public class Myboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Myboot1Application.class, args);
		System.out.println("프로젝트 팀장이 추가하는 라인");
		System.out.println("프로젝트 팀원이 추가하는 라인");
		System.out.println("프로젝트 팀원이 동시에 추가하는 라인");
	}

}
