package simplepainter;

//ウィンドウ表示プログラム
import javax.swing.*;

public class SimplePainter {

	public static void main(String[] args) {
		//JFrameのインスタンス生成
		JFrame frame = new JFrame("SimplePainter");
		//閉じるボタンを押した際に終了する処理
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ウィンドウのサイズ
		frame.setSize(600, 400);
		//ウィンドウの表示位置を設定
		frame.setLocationRelativeTo(null);
		//ウィンドウを可視化(見えるように)
		frame.setVisible(true);

		//JLabelのインスタンス生成(引数渡し)
		JLabel label = new JLabel("Hello World");
		//生成したlabelを、ウィンドウに追加
		frame.add(label);

	}
}
