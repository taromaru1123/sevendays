package day6;

public class SampleClass01 {

	//フィールド(データ)
	int n = 10;
	String s = "field";

	//メソッド(操作)
	int add(int a,int b) {
		return a + b;
	}

	String add(String s) {
		return this.s + s;
	}

	void showNum() {
		System.out.println("n = " + n);
	}
}
