package execution;

import java.util.Objects;
import java.util.Scanner;

import process.Process2;

public class Execution {

	public static void main(String[] args) {
		/*
		 
		 名前を入力したら下記がコンソールに出力されるように作ってください
			条件：数値は毎回変わるように作ってください
			 	 サブクラスを使用してください
				 スーパークラスを使用してください
				 getterとsetterを使用してください
				 packageを2つ作ってメインと処理を分けてください
				 命名する場合は規則にのっとってください
				 コンストラクタを使用してください

			こんにちは 「 名前 」 さん
			ステータス
			HP：849
			MP：862
			攻撃力：375
			素早さ：937
			防御力：24

			さあ冒険に出かけよう！
		 
		 */
		// インスタンスを作成
		Scanner scanner = new Scanner(System.in);
		// コンソール入力値を代入
		String name = scanner.nextLine();
		if(Objects.isNull(name) || name.length() <= 0) {
			System.out.println("名前を入力してください");
		} else {
			Process2 a = new Process2(name);
			a.display();
		}
		scanner.close();
	}
}
