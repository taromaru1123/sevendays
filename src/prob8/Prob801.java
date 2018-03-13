package prob8;

public class Prob801 {
	public static void main (String args[]) {
		int a = 1,b = 1,c = 1;
		int count = 0;

		//System.out.println(a * a + b * b);
		while(c <= 100) {
			while(b <= 100) {
				while(a <= 100) {
					if (a * a + b * b == c * c) {
						count++;
						System.out.println("a="+a+",b="+b+",c="+c);
					}
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
