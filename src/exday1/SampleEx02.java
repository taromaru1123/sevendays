package exday1;

public class SampleEx02 {
	public SampleEx02(){
        System.out.println("コンストラクタ");
    }
    public void foo(){
        System.out.println("インスタンスメソッド");
    }
    public static void bar(){
        System.out.println("静的メソッド");
    }
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        SampleEx02 i = new SampleEx02();
        i.foo();
        //  様々な静的メソッドの呼び出し
        i.bar();                //  インスタンスからも、静的メソッドを呼べる
        SampleEx02.bar();      //  クラス名からの呼び出し
        bar();                  //  同じクラス内なら、クラス名無しでも呼び出せる。
        //      ガーベージコレクタの呼び出し
        System.gc();
    }
}
