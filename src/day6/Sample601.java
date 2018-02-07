package day6;

public class Sample601 {
	public static void main(String[] args) {
		//インスタンス生成
		SampleClass01 s = new SampleClass01();

		//フィールドnに値を代入する
		s.n = 100;

		//フィールドsに値を代入
		s.s = "Hello";

		//メソッドadd()を呼び出し
		int ans = s.add(1,2);

		//メソッドadd()を呼び出し
		String str = s.add("World");

		//呼び出し結果の表示
		System.out.println("ans =" + ans);
		//呼び出し結果の表示
		System.out.println("str =" + str);

		s.showNum();

	}
}
