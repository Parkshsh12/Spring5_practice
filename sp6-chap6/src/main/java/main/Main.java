package main;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtx_2;
import spring.Client;
import spring.Client2;

public class Main {
	
	public static void main(String[] args) throws IOException {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx_2.class);
		
		Client2 client2 = ctx.getBean(Client2.class);
		client2.send();
		ctx.close();
	}
}
