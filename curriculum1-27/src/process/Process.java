package process;

public class Process {
	// 配列を宣言
	String[] data;
	// コンストラクタを作成
	public Process(String a) {
		data = a.split(":");
	}
	// メソッドを作成
	public void display() {
		// コンソール出力
		System.out.println("動物名" + data[0]);
		System.out.println("体長" + data[1] + "m");
		System.out.println("速度" + data[2] + "km/h");
		// 条件分岐
		switch(data[0]) {
		case "ライオン":
			System.out.println("学名：パンテラ レオ\n");
			break;
		case "ゾウ":
			System.out.println("学名：ロキソドンタ・サイクロティス\n");
			break;
		case "パンダ":
			System.out.println("学名：アイルロポダ・メラノレウカ\n");
			break;
		case "チンパンジー":
			System.out.println("学名：パン・トゥログロディテス\n");
			break;
		case "シマウマ":
			System.out.println("学名：チャップマンシマウマ\n");
			break;
		case "インコ":
			System.out.println("学名：不明\n");
		}
	}	
}
