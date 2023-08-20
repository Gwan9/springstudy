package junitTest;

// 소프트웨어 개발에 있어서 단위 테스트 (Unit Test)
// ==> 통칭 : XUnit
// 자바 프로잭트에서 사용되는 단위 테스트 도구 : JUnit 
public class TestMain {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int result = c.sum(100,200);
		System.out.println("result : " + result + " 내가 의도한 값은 : " + 300 );

	}

}
