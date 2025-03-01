package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		long startTime = System.currentTimeMillis();

		int result = 0;
		for (int i = 0; i < 1000000; i++) {
				result += 1;
		}
		System.out.println("Result: " + result);

		long endTime = System.currentTimeMillis();

		System.out.println("開始時刻：" + startTime + "ms");
		System.out.println("終了時刻" + endTime + "ms");
		System.out.println("処理時間" + (endTime - startTime) + "ms");
	}

}
