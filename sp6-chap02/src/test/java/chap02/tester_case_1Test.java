package chap02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.time.Duration;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class tester_case_1Test {
	
	String test = "no";
	
	@Test
	@DisplayName("AssumeTest")
	void testSum() {
//		test_case_1 t2 = null;
//		test_case_1 t1 = new test_case_1();
//		assertAll(
//				()->assertTrue(t1.getSum() > 1,()->"sum의 값이 1보다 크지 않습니다."),
//				()->assertEquals(4, t1.sum(1, 2)),
//				()->assertNotNull(t2)
//				
//				);
//		System.out.println("첫번째 메서드");
//		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> new test_case_1(-1));
//		String message = exception.getMessage();
//		assertEquals("음수가 입력되었습니다.", message);
		
//		assertTimeout(Duration.ofSeconds(2), ()->{
//			new test_case_1(1);
//			Thread.sleep(3000);
//		});
		
//		test_case_1 t1 = new test_case_1(3);
//		assumeTrue("ok".equals(test));
//		assertThat(t1.sum(1, 2)).isEqualTo(3);
		
		assumingThat("no".equals(test), ()->{
			test_case_1 t1 = new test_case_1(10);
			assertThat(t1.getSum()).isGreaterThan(0);
		});
		
		assumingThat("ok".equals(test), ()->{
			test_case_1 t1 = new test_case_1(4);
			assertThat(t1.getSum()).isGreaterThan(1);
		});
	}
	
//	@Test
//	void test2() {
//		System.out.println("두번째 메서드");
//	}
//	
//	@BeforeAll
//	static void beforeall() {
//		System.out.println("before_all");
//	}
//	
//	@AfterAll
//	static void afterall() {
//		System.out.println("after_all");
//	}
//	
//	@BeforeEach
//	void beforeeach(){
//		System.out.println("before_each");
//	}
//	
//	@AfterEach
//	void aftereach() {
//		System.out.println("after_each");
//	}
//	
	

}
