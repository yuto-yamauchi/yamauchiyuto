package execution;

import process.Process;

public class Execution {

	public static void main(String[] args) {
		
		/*
	 	
	 	下記がコンソールに出力されるように作成してください
	 	※thisとsetterとgetterとフィールドを使ってください
	 	
	  	動物名：ライオン
		体長：2.1m
		速度：80km/h
	 	
	 */
		// インスタンスの作成
		Process process = new Process();
		// 各メソッドに引数を渡し、、各メソッドの呼び出し
		process.setAnimal("ライオン");
		System.out.println("動物名:" + process.getAnimal());
		process.setBody(2.1);
		System.out.println("体長:" + process.getBody() + "m");
		process.setSpeed(80);
		System.out.println("速度:" + process.getSpeed() + "km/h");
	}
}
