package day4;

public class Prob409 {
	public static void main(String[] args) {

		int i;

		while(true) {
			i = (int)(Math.random()*100)+1;
			System.out.println(i);
			if((i % 10) == 0) {
				System.out.println("終了します");
				break;
			}
		}
	}
}
