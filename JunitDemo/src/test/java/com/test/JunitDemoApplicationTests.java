package com.test;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitDemoApplicationTests {

	//@Disabled
	@Test
	void contextLoads() {
	}
	
	@Test
	void testSum() {
		 
		int expectedSum = 10;
		
		int actualSum = Calculator.doSum(6, 4);
		
		// test 
		assertThat(expectedSum).isEqualTo(actualSum);
		
	}

	@Test
	void testCompareNums() {
		
		Boolean actuaBoolean = Calculator.compareNums(5, 5);
		
		assertThat(actuaBoolean).isTrue();
	}
	
}
