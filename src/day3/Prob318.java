package day3;

public class Prob318 {
	public static void main(String[] args) {
		int a = (int)(Math.random()*45)-10;

		System.out.println("摂氏" + a + "度");

		if (a >= 30) {
			System.out.println("真夏日です。");
		}else if(a >= 25) {
			System.out.println("夏日です。");
		}else if(a < 0) {
			System.out.println("真冬日です。");
		}
	}
}
