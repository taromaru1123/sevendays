package exday1;

public class TestClass01 {
	private int a = 0;              //  インスタンスフィールド
    private static int b = 100;         //  静的フィールド

    public static int getTest(){
        return b;
    }
    //  インスタンスフィールドを取得
    public int getValue(){
        return a;
    }
}
