package exday3;

public class SampleClassEx301 {
	public static void main(String args[]){
        Crow1 c = new Crow1();          //  カラスクラス
        Sparrow1 s = new Sparrow1();    //  すずめクラス
        //  カラスがなく
        System.out.print(c.getName()+" : ");
        c.sing();
        //  雀がなく
        System.out.print(s.getName()+" : ");
        s.sing();
    }
}
