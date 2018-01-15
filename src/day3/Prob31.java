package day3;

public class Prob31 {
	public static void main(String[] args) {


		while(true) {
			int i = (int)(Math.random()*6)+1;

			System.out.println(i);

			if(i >= 5) {
				System.out.println("5以上です");
				break;
			}
		}

	}
}
