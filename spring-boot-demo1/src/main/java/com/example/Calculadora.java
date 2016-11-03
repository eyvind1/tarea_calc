package com.example;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Calculadora {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! " + new Date();
    }

    @RequestMapping("/calculadora")
    @ResponseBody
    Integer calculadora(@RequestParam Integer x,@RequestParam Integer y,@RequestParam String operador) {
	Integer resultado;
	switch(operador){
	case "+":
		resultado=x+y;
	case "-":
		resultado=x-y;
	case "*":
		resultado=x*y;
	case "/":
		resultado=x/y;
	default:
		System.out.print ("error");

	}
        return resultado;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Calculadora.class, args);
    }
}
