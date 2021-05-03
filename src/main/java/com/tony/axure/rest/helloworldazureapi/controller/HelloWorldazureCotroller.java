package com.tony.axure.rest.helloworldazureapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldazureCotroller {
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		 
		return "Hello World!!!!";
	}
	
	
	
	@GetMapping(path="/hello-world/{name}")
	public String helloWorldPathVariable(@PathVariable String name) {
		 
		return "Hello World Welcome "+name+" !!!...";
	}
	
	@GetMapping(path="/hello-world/{name}/{age}")
	public String helloWorld(@PathVariable String name,@PathVariable String  age) {
		 
		return "Hello World Welcome "+name+" !!!... and your age is "+age;
	}

}
