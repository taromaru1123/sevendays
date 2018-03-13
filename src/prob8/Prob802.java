package prob8;

public class Prob802 {
	public static void main (String args[]) {
		int a = 1,b = 1,c = 1;
		int count = 0;
		int x = 110,y = 2;
		boolean flag = false;
		int arry[][] = new int[x][y];

		//2次元配列に0を初期化
		for (int i = 0;i < x;i++) {
			for(int j = 0;j < y;j++) {
				arry[i][j] = 0;
			}
		}

		//System.out.println(a * a + b * b);
		while(c <= 100) {
			while(b <= 100) {
				while(a <= 100) {
					if (a * a + b * b == c * c) {		//組み合わせを探す
						for(int i = 0;i < x;i++) {		//過去にあるか探す
							if (a == arry[i][1]) {
								if (b == arry[i][0]) {
									flag = true;		//あったら　カウントしない
								}
							}
						}
						if (flag == false) {			//なかったらカウントする
							count++;
							arry[a-1][0] = a;
							arry[a-1][1] = b;
							System.out.println("a="+a+",b="+b+",c="+c);
						}
						//count++;
						//System.out.println("a="+a+",b="+b+",c="+c);
					}
					flag = false;
					a++;
				}
				a = 1;
				b++;
			}
			b = 1;
			c++;

		}
		System.out.println("組み合わせ数："+count);
	}
}
