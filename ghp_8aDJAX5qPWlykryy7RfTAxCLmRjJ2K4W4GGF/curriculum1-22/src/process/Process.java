package process;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Process {
	//各変数を宣言
	private String country;
	private String food;
	private String type;
	private String date;
	// 各コンストラクタを作成し、変数を代入
	public Process(String country){
		this.country = country;
	}
	public Process(String food,String type) {
		this.food = food;
		this.type = type;
	}
	public Process() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		date = sdf.format(now);
	}
	 // 各メソッドを作成
    public void displayCountry() {
        if (country != null) {
            System.out.println("こんにちは！ここは" + this.country + "です！");
        } else {
            System.out.println("国が設定されていません。");
        }
    }
    public void displayFood() {
        if (food != null && type != null) {
            System.out.println("この" + this.food + "うまい");
            System.out.println(this.food + "は" + this.type + "です");
        } else {
            System.out.println("食べ物またはタイプが設定されていません。");
        }
    }

    public void displayDate() {
        if (date != null) {
            System.out.println("今の現在日時は" + date + "です");
        } else {
            System.out.println("日付が設定されていません。");
        }
	}
}
