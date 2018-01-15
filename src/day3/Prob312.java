package day3;

public class Prob312 {
	public static void main(String[] args) {

		int i = (int)(Math.random()*20)-10;

		System.out.println(i);

		if(i < 0) {
			System.out.println("負の値です。");
		}else if(i > 0) {
			System.out.println("正の値です。");
		}else {
			System.out.println("0です。");
		}
	}
}
