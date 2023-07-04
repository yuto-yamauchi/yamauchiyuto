package basicClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// Dogクラスを呼び出して変数に代入し動物の名前を出力
		Dog name = new Dog();
		System.out.println(name.dogName);
		// Dogクラスを呼び出して変数に代入し動物の数を出力
		Dog num = new Dog(2);
		System.out.println(num.animal + "匹");
		// 現在の日時を取得
        Date now = new Date();
        // 日時のフォーマットを指定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        // フォーマットに基づいて日時を文字列に変換
        String formattedDate = sdf.format(now);
        System.out.println("現在の日時: " + formattedDate);
	}
}
