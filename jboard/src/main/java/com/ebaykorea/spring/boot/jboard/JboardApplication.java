package com.ebaykorea.spring.boot.jboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JboardApplication {

	// 빈들은 id라는 값을 가지고 있다. 메소드 이름이 id가 된다.
	// 빈을 생성하는 메소드는 이름이 같으면 안된다.
	@Bean
	public MyUtil myUtil(){
		return new MyUtil();
	}

	@Bean
	public MyUtil myUtil2(){
		return new MyUtil();
	}

	@Bean
	public Calc calc(){
		return new Calc();
	}

	public static void main(String[] args) {
		SpringApplication.run(JboardApplication.class, args);
	}
}
