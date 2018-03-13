package exday4;

//武器クラス
public abstract class Weapon {
	private String name="";

	//public int test = 100;

	//  コンストラクタ
	public Weapon(String name){
	    //  武器の名前を設定
	    this.name = name;
	}
	//  武器の名前を取得
	public String getName(){
	    return this.name;
	}
	//  攻撃メソッド
	public abstract void attack();
}
