package simplepainter;

import java.io.*;

public class InputOutput {
	public static void main(String[] args) {

		try {

			//キーボード入出力用のオブジェクト
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			//ファイル出力用のオブジェクト
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("InputOutput.txt")));

			int cnt = 0;	//件数カウント
			while(true) {
				System.out.println("キーボードから名前を入力してください。終了＝END");
				String str = br.readLine();	//キーボードから入力
				if(str.equals("END")) {	//ENDが入力されるまでループする。
					break;
				}else {
					pw.println(str);	//ファイルに書き出し
					cnt += 1;	//件数をインクリメント
				}
			}
			System.out.println(cnt + "件ファイルに書き出しました。");
			pw.close();	//ファイルのクローズ。絶対にクローズすること！

			//ファイル入力用のオブジェクト
			BufferedReader fr = new BufferedReader(new FileReader("InputOutput.txt"));
			String str = fr.readLine();
			cnt = 0;
			while(str != null) {
				System.out.println(str);
				str = fr.readLine();
				cnt += 1;
			}
			System.out.println(cnt + "件のデータを読み込み、画面に表示しました。");
			fr.close();	//ファイルのクローズ。

		}catch(Exception e) {
			System.out.println("例外発生");
		}
	}
}
