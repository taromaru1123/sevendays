package exday1;

public class Test01 {
	public static void main(String[] args) {
        TestClass01 t1 = new TestClass01();
        TestClass01 a1 = t1;
        TestClass01 b1 = a1;

        t1.a = 100;
        a1.a = 50;
        System.out.println(t1.a);
        //TestClass01 t2 = new TestClass01();
        //  インスタンスの数を表示
        //System.out.println("インスタンス数："+TestClass01.getTest());
        //  インスタンスを生成する
        //s1 = new SampleClassEx01(50);   //  コンストラクタ①を呼び出す
        //s2 = new SampleClassEx01();     //  コンストラクタ②を呼び出す
        //  値を取得して表示する
        //System.out.println(t1.getValue());
        //System.out.println(t2.getValue());
        //  インスタンスの数を表示
        //System.out.println("インスタンス数："+SampleClassEx01.getNumberOfInstance());
    }
}
