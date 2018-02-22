package exday1;

public class TestClass01 {
	public int a = 0;              //  インスタンスフィールド
    private static int b = 100;         //  静的フィールド

    public TestClass01() {
    	System.out.println("aaaa");
    	b++;
    }
    public static int getTest(){
        return b;
    }
    //  インスタンスフィールドを取得
    public int getValue(){
    	b++;
        return a;
    }
}
