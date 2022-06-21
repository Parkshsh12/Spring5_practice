package main;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtx_2;
import spring.Client;

public class Main {
	
	public static void main(String[] args) throws IOException {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx_2.class);
		
		Client client = ctx.getBean(Client.class);
		client.send();
		
		ctx.close();
	}
}
