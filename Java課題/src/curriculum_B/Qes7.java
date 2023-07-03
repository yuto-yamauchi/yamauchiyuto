package curriculum_B;

import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
    	// scannerインスタンス作成し値を代入
        Scanner scanner = new Scanner(System.in);
        System.out.print("生徒の人数を入力してください（2以上）: ");
        int a = scanner.nextInt();
        // 配列を宣言
        int table[][] = new int [a] [4];
        double sum[] = new double [a];
        // 変数の初期化、宣言
        double eigo = 0;
        double sugaku = 0;
        double rika = 0;
        double syakai = 0;
        double ave;
        String [] subject = {"英語","数学","理科","社会"};
        // 人数が2人以上の場合実行
        if(a >= 2) {
        	//　ループ処理
        	for(int i = 0; i < a; i++) {
        		
        		for(int num = 0; num < subject.length; num++) {
        			System.out.print((i + 1) + "人目の『" + subject[num] + "』の点数を入力してください：");
        			table[i][num] = scanner.nextInt();
        		}
        		System.out.println();
        		// 教科数のループ処理
        		for(int j = 0; j < 4; j++) {
        			sum[i] += table[i][j];
        		}
        		// 各教科の合計点を代入
        		eigo += table[i][0];
        		sugaku += table[i][1];
        		rika += table[i][2];
        		syakai += table[i][3];
        	}
        	// 人数分ループ処理
        	for(int k = 0; k < a; k++) {
        		ave = sum[k] / 4;
        		System.out.println((k + 1) + "人目の平均点は" + String.format("%.2f", ave) + "点です。");
    		}
        	System.out.println();
        	// 各教科、平均点を出力
        	System.out.println("英語の平均点は" + String.format("%.2f", eigo / a) + "点です。");
        	System.out.println("数学の平均点は" + String.format("%.2f", sugaku / a) + "点です。");
        	System.out.println("理科の平均点は" + String.format("%.2f", rika / a) + "点です。");
        	System.out.println("社会の平均点は" + String.format("%.2f", syakai / a) + "点です。");
        	System.out.println("全体の平均点は" + String.format("%.2f", (eigo + sugaku + rika + syakai) / (a * 4)) + "点です。");
    		}
        //　スキャナーを閉じる
        scanner.close();
      }
}
        		
        		