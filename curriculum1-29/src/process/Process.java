package process;

import java.util.Arrays;
import java.util.Collections;

public class Process {
	// 配列の初期化
	String[] prefecture = {"北海道:札幌市:83424",
			"青森県:青森市:9646",
			"岩手県:盛岡市:15275",
			"宮城県:仙台市:7282",
			"秋田県:秋田市:11638",
			"山形県:山形市:9323",
			"福島県:福島市:13784",
			"茨城県:水戸市:6097",
			"栃木県:宇都宮市:6408",
			"群馬県:前橋市:6362",
			"埼玉県:さいたま市:3798"
	};
	// メソッド作成
	public void prefectureSplit(String str) {
		String[] split = str.split(",");
		int check = 0;
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals("昇順")) {
				check = 1;
			}
			else if(split[i].equals("降順")) {
				check = 2;
			}
		}
		// 変数の値が1の時の処理
		if(check == 1) {
			Arrays.sort(split);
			for(int j = 0; j < split.length - 1; j++) {
				Process2 display = new Process2();
				int num = Integer.parseInt(split[j]);
				display.display(prefecture[num]);
			}
		}
		// 変数の値が2の時の処理
		else if(check == 2) {
			Arrays.sort(split, Collections.reverseOrder());
			for(int j = 1; j < split.length; j++) {
				Process2 display2 = new Process2();
				int num = Integer.parseInt(split[j]);
				display2.display(prefecture[num]);
			}
		}
	}
}