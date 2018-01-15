package day3;

public class Prob313 {
	public static void main(String[] args) {

		int i = (int)(Math.random()*3)+1;

		System.out.println(i);

		switch(i) {
		case 1:
			System.out.println("グー");
			break;

		case 2:
			System.out.println("パー");
			break;

		case 3:
			System.out.println("チョキ");
			break;

		//default:
		//	System.out.println("？");
		}
	}
}
