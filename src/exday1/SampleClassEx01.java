package exday1;

public class SampleClassEx01 {
	private int value = 0;              //  インスタンスフィールド
    private static int num = 0;         //  静的フィールド
    //  コンストラクタ①　引数あり
    public SampleClassEx01(int value){
        //  引数をインスタンスフィールドに代入
        this.value = value;
        //  静的メンバのインクリメント
        num++;
    }
    //  コンストラクタ②　引数なし
    public SampleClassEx01(){
        this(100);  //  引数つきコンストラクタを呼び出す
    }
    //  インスタンスの数を取得
    public static int getNumberOfInstance(){
        return num;
    }
    //  インスタンスフィールドを取得
    public int getValue(){
        return this.value;
    }
}
/*static変数は、複数インスタンスあっても共通変数になる。
 * static関数で、メンバ変数が使えないのは、インスタンス生成していないのでメンバ変数が存在しない。
 * staticはどこからでも、クラス名.関数名で呼び出せる。
 */

