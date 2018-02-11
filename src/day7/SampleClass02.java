package day7;

public class SampleClass02 {

	//privateメソッド
	private void method1() {
		System.out.println("method1(private)");
	}
	//publicメソッド①
	public void method2() {
		System.out.println("method2(public)");
	}
	//publicメソッド②
	public void method3() {
		//privateメソッド
		method1();
		System.out.println("method3(public) : num=" + this.num);
	}
	//privateフィールド
	private int num = 1;

	//コンストラクタ
		public SampleClass02() {
			System.out.println("コンストラクタ");
		}
		/*コンストラクタの使い道とか
		 *価が最初から決まっていて、変える必要がない時に使ったり
		 */
}
