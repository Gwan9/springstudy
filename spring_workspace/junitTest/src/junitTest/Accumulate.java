package junitTest;

public class Accumulate {
	
	// 시작 수, 끝 수
	// 1, 10 => 1부터 10까지 누적 합을 리턴하는 메서드
	public int cum(int start, int end) {
		int num = 0;
		for(int i=start; i<=end ; i++) {
			num+=i;
		}
		return num;
	}
}
