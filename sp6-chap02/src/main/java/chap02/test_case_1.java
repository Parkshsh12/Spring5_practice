package chap02;

public class test_case_1 {
	
	int sum = 1;
	
	public test_case_1() {}
	
	public test_case_1(int sum) {
		if(sum < 0) {
			throw new IllegalArgumentException("음수가 입력되었습니다.");
		}
		this.sum = sum;
	}
	
	public int getSum() {
		return sum;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
}
