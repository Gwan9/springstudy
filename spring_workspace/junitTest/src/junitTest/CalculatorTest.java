package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test //@Test 가 메서드 위에 선언되면 이 메서드는 테스트 대상 메소드임을 의미함
	void testSum() {
		Calculator c = new Calculator();
		
		// assertEquals(기대값, 실제값);
		System.out.println("테스트 1번");
		assertEquals(300, c.sum(200, 100));
	}
	@Test
	void test_두수의차이검정_minus() {
		// 두 수의 차를 리턴하는 minus()를 만들고
		// 올바르게 수행되었는지 단위코드를 작성하세요
		
		Calculator c = new Calculator();
		System.out.println("테스트 2번");
		assertEquals(300 ,c.sum(500, 200));
	}

}
