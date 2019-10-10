package com.nejeoui.interpreter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InterpreterApplication {
	public static ConfigurableApplicationContext ctx=null;
	public static void main(String[] args) {
		 ctx =	SpringApplication.run(InterpreterApplication.class, args);
	}
	
	public static void close() {
		ctx.close();
	}

}
