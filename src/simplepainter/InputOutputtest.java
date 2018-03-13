package simplepainter;

import java.io.*;

//入力、削除、表示させる。ファイル名も入力させる。
public class InputOutputtest {
	public static void main(String[] args) {
		try {
			//キーボード入出力用のオブジェクト
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ファイル名を入力してください。");
			String FileName = br.readLine();

			System.out.println("---------------------------------------");
			int num;
			do {
				System.out.println("入力:1");
				System.out.println("削除:2");
				System.out.println("表示:3");
				System.out.println("終了:4");
				num = Integer.parseInt(br.readLine());
				switch(num) {
					case 1:
						Input ip = new Input(FileName);
						ip.input();
						break;
					case 2:
						Delete dl = new Delete(FileName);
						dl.delete();
						break;
					case 3:
						Output op = new Output(FileName);
						op.output();
						break;
					case 4:
						System.out.println("終了します。");
						break;
					default:
						System.out.println("unknwon");
						System.out.println(num);
					    break;
				}
			}while(num != 4);
		}catch(Exception e) {
			System.out.println("例外発生");
		}
	}
}

//入力用クラス
class Input {
	String name;	//ファイル名

	//ファイル名取得コンストラクタ
	protected Input(String FileName) {
		name = FileName;
	}

	protected void input() {
		try {
			//キーボード入出力用のオブジェクト
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


			int cnt = 0;

			//ファイル出力用のオブジェクト
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(name)));


				while(true) {
					System.out.println("名前を入力してください。終了はENDを入力。");
					name = br.readLine();
					if(!(name.equals("END"))) {
						pw.println(name);
						cnt += 1;
					}else {
						break;
					}
				}
				System.out.println(cnt+"件、入力しました。");
				pw.close();
		}catch(Exception e) {
			System.out.println("例外発生");
		}
	}
}

//削除用クラス
class Delete{

	String name;	//ファイル名
	String ary[] = new String[10];
	int num;	//削除する値

	//ファイル名取得コンストラクタ
	protected Delete(String FileName) {
		name = FileName;
	}

	protected void delete() {
		try {
			//ファイル入力用のオブジェクト
			BufferedReader fr = new BufferedReader(new FileReader(name));
			String str = fr.readLine();
			int cnt = 0;
			//表示
			for(int i=0;str != null;i++) {
				System.out.println(i+1+"："+str);
				ary[i] = str;
				str = fr.readLine();
				cnt += 1;
			}

			System.out.println("削除する番号を入力してください。");
			//キーボード入出力用のオブジェクト
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			num = Integer.parseInt(br.readLine());


			//ファイル出力用のオブジェクト
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(name)));

			//つめる
			for(int i=num;i<ary.length;i++) {
				ary[i-1] = ary[i];
				pw.print(ary[i-1]);
			}


			System.out.println(num + "番削除しました。");
			fr.close();	//ファイルのクローズ。
		}catch(Exception e) {
			System.out.println("例外発生");
		}
	}
}

//出力用クラス
class Output{
	String name;	//ファイル名

	//ファイル名取得コンストラクタ
	protected Output(String FileName) {
		name = FileName;
	}

	protected void output() {
		try {
			//ファイル入力用のオブジェクト
			BufferedReader fr = new BufferedReader(new FileReader(name));
			String str = fr.readLine();
			int cnt = 0;
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

/*try {

	//キーボード入出力用のオブジェクト
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String FileName;
	System.out.println("ファイル名を入力してください。");
	FileName = br.readLine();

	//ファイル出力用のオブジェクト
	PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(FileName)));

	String[] ary = new String[10];

	while(ary[i] != null) {

	}

	for(int i=0;i<ary.length;i++) {
		System.out.println("名前を入力してください。終了はEND");
		ary[i] = br.readLine();
		if(ary[i] != null) {
			pw.println(ary[i]);
		}else {
			break;
		}
	}




	//ファイル入力用のオブジェクト
//	BufferedReader fr = new BufferedReader(new FileReader("InputOutput.txt"));

}catch(Exception e) {
	System.out.println("例外発生");
}
*/