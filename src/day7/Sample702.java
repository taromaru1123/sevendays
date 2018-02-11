package day7;

public class Sample702 {
	public static void main(String[] args) {
        //  引数つきコンストラクタの呼び出し
        SampleClass03 s = new SampleClass03("HelloWorld.");
        //  SampleClass03 s = new SampleClass03();
        //  numberのセッターで、値を設定
        s.setNumber(100);
        //  ゲッターで値を呼び出し、内容を表示
        System.out.println(s.getNumber());
        System.out.println(s.getStr());
    }
	/*セッターゲッターは、プライベート変数をいじる
	 * カプセル化→余計な物は見せない　クラスから見て
	 * 			必要なものしか触れない
	 *セッターゲッターある意味は、値が変った時にログを出力させる場合
	 *例　a.atai = 100;の記述の前後にSystemprintを記述しないといけないが
	 *set...を使えば１回ですむ。
	 *
	 */
}
