package day5;

public class Prob501 {
	public static void main(String args[]) {

		int[] a = new int[7];

		for (int i = 0;i < a.length; i++) {
			a[i] =  (int)(Math.random()*10);
			System.out.print(a[i] + ",");
		}

	}
}
