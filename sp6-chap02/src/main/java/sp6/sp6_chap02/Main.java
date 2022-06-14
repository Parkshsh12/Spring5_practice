package sp6.sp6_chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Greeter g = ctx.getBean("greeter", Greeter.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter1", Greeter.class);
		String msg = g.greet("박승현");
		System.out.println("(g == g1) = " + (g == g1));
		System.out.println("(g1 == g2) = " + (g1 == g2));
		System.out.println(msg);
		ctx.close();
	}

}
