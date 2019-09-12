package com.example.springboottravis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
//
public class HelloWorldController {

	@GetMapping(path = "")
	public String helloWorld() {
		return "Hello World";
	}
}
