package com.jmv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SbDockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDockerTestApplication.class, args);
	}

}

@RestController 
@RequestMapping("hello")
class HelloController {
	
	@GetMapping("1")
	public String hello() {
		return "hello!!! from docker..";
	}
	
	@GetMapping("2")
	public String hello1() {
		return "hello1!!! from docker..";
	}
	
	@GetMapping("3")
	public String hello3() {
		return "hello3!!! from docker..";
	}

	@GetMapping("4")
	public String hello4() {
		return "hello4!!! from docker..";
	}
	
}