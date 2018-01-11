package day3;

public class Sample304 {
	public static void main(String[] args) {
		int dice =(int)(Math.random()*7)+1;  //１から７までの乱数を発生させる。
		//さいころの目を入力
		System.out.println("さいころの目：" + dice);
		//値が、さいころの目の範囲内かどうか調べる
		if(1 <= dice && dice <=6) {
			//さいころの目が、偶数か、奇数かで、処理を分ける。
			if(dice == 2 || dice == 4 || dice == 6) {
				System.out.println("丁です。");
			}else {
				System.out.println("半です。");
			}
		}else {
			System.out.println("範囲外の数値です。");
		}
	}
}
