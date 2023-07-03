package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {		
		// scannerインスタンス作成しusernameを代入
		 Scanner scanner = new Scanner(System.in);
			String username = scanner.nextLine();
			
			//入力された文字数に対しての処理
			if (username == null) {
			    System.out.println("「名前を入力してください」");
			} else if (username.length() <= 0) {
				System.out.println("「名前を入力してください」");
			} else if (username.length()>10) {
			    System.out.println("「名前を10文字以内にしてください」");
			} 
			// 入力された値が正常の場合の処理
			else if (Pattern.matches("^[A-Z a-z 0-9]+$", username)) {
			    System.out.println("ユーザー名「" + username + "」を登録しました");
			    String janken[] = {"グー","チョキ","パー"};
			    String Hand;
			    String otherHand;
			    int i =0;
			   // do-while文でループ処理
			    do {
			    	Random random = new Random();
			    	int index = random.nextInt(janken.length);
			    	Hand = janken[index];
			    	index = random.nextInt(janken.length);
			    	otherHand = janken[index];
			    	System.out.println(username + "の手は「" + Hand +"」");
			    	System.out.println("相手の手は「" + otherHand +"」\n");
			    	// 自分が勝った場合の処理
			    	if(Hand == "グー" && otherHand == "チョキ" || Hand == "チョキ" && otherHand == "パー"|| Hand == "パー" && otherHand == "グー") {
			    		System.out.println("やるやん。\n次は俺にリベンジさせて\n");
			    	}
			    	// グーに負けた場合の処理
			    	else if(Hand == "チョキ" && otherHand == "グー") {
			    		System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ\n");
					}
			    	// チョキに負けた場合の処理
			    	else if(Hand == "パー" && otherHand == "チョキ") {
			    		System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
			    	}
			    	// パーに負けた場合の処理
			    	else if(Hand == "グー" && otherHand == "パー") {
			    		System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
			    	}
			    	// あいこの場合の処理
			    	else if(Hand == otherHand) {
			    		System.out.println("DRAW あいこ もう一回しましょう！\n");
			    	}
			    	i++;     
			    // 負けた場合かあいこの場合は再度処理実行
			    }while(Hand == "チョキ" && otherHand =="グー" || Hand == "パー" && otherHand =="チョキ" || Hand == "グー" && otherHand =="パー" || Hand == otherHand);
			    System.out.println("勝つまでにかかった合計回数は" + i + "回です");
			}
			// 入力された値が半角英数字の場合の処理
			else {
				System.out.println("半角英数字のみで名前を入力してください");
				
				// スキャナーを閉じる
				scanner.close();
			}
		}        
	}
     