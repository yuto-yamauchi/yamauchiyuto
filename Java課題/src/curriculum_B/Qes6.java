package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	
    public static void main(String[] args) {
    	// scannerインスタンス作成し値を代入
    	Scanner scanner = new Scanner(System.in);
    	String line = scanner.nextLine();
    	String values [] = line.split("、");
    	// randomインスタンス作成し0~11の値をランダムで代入
    	Random random = new Random();
    	int index = random.nextInt(12);
    	// ループ処置し値を代入
    	for(String code: values) {
    		// 条件指定
    		switch(code) {
    		// 値がパソコンの時の処理
    		case "パソコン":
    			index = random.nextInt(12);
    			System.out.println(code + "の残り台数は" + index + "台です\n");
    			break;
    		// 値が冷蔵庫の時の処理
    		case "冷蔵庫":
    			index = random.nextInt(12);
    			System.out.println(code + "の残り台数は" + index + "台です\n");
    			break;
    		// 値が扇風機の時の処理
    		case "扇風機":
    			index = random.nextInt(12);
    			System.out.println(code + "の残り台数は" + index + "台です\n");
    			break;
    		// 値が洗濯機の時の処理
    		case "洗濯機":
    			index = random.nextInt(12);
    			System.out.println(code + "の残り台数は" + index + "台です\n");
    			break;
    		// 値が加湿器の時の処理
    		case "加湿器":
    			index = random.nextInt(12);
    			System.out.println(code + "の残り台数は" + index + "台です\n");
    			break;
    		// 値がテレビ、ディスプレイの時の処理
    		case"テレビ":
    		case"ディスプレイ":
    			int result = code.equals("テレビ") ? index: 11 - index;
    			System.out.println(code + "の残り台数は" + result + "台です\n");
    			break;
    		// 値がその他の時の処理
    		default:
    			System.out.println("『" + code +  "』" + "は指定の商品ではありません\n");
    			break;    			
    		}
    	}
    }    	        
}