package day3;

public class Prob34 {
	public static void main(String[] args){
		while(true) {
			int i = (int)(Math.random()*100)+1;

			System.out.println(i);

			if(i <= 10 || i >= 90) {
				System.out.println("10以下か90以上の値です");
				break;
			}
		}
	}
}
