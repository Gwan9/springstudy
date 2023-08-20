package junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// 이렇게 개발하는 것을 '테스트주도 개발 (TDD)' 라고 한다
// TDD(Test-Driven development) 테스트 주도 개발
// 선 테스트 후 개발하는 프로그램 방법
class CalculatorTest2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("전체 테스트 시작전에 1회만 실행");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("전체 테스트 끝부분에서 1회만 실행");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("각 테스트 시작되기 전에 먼저 실행");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("각 테스트 끝 부분에서 실행");
	}

	@Test
	void testSum() {
		System.out.println("sum() test 중");
		
		Calculator c = new Calculator();
		assertEquals(300, c.sum(100, 200));
		
		//assertSame(a,b);  // a 와 b 가 같은 객체인지 확인
		
		Calculator d ;
		
		d = c;
		
		assertSame(c, d);
		
		boolean a = true;
		
		assertTrue(a);
		
		assertNotNull(a); // null 아님을 확인
		
		// assertArrayEquals(a,b)
		int[] m = {1,2,3};
		int[] n = m ;
		assertArrayEquals(n,m);
	}

	@Test
	void testMinus() {
		System.out.println("munus() test 중");
	}

}
