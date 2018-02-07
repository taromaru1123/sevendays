package day5;

public class Prob513 {
	public static void main(String args[]) {

		int max = 0;
		int min = 0;
		int kari = 0;

		int[][] a = new int[3][3];

		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length; i++) {
				kari = (int)(Math.random()*10);

				if(i == 0 && j == 0) {
					max = kari;
					min = kari;
				}else if (max < kari) {
					max = kari;
				}else if (min > kari) {
					min = kari;
				}
				a[j][i] = kari;
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}

		System.out.println("最大値：" + max);
		System.out.println("最小値：" + min);
	}
}
