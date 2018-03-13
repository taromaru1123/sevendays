package exday4;

public class SampleEx402 {
	public static void main(String[] args) {
        Tank t = new Tank();
        //System.out.println(t.test);	//親クラスの変数を使用できる。
        System.out.println(t.getName()+"の武器の名前:"+Tank.WEAPON_NAME);
        System.out.println(t.getName()+"の武器のタイプ:"+Tank.TYPE_NAME);
        System.out.println();
        t.attack(); //  攻撃
    }
}
