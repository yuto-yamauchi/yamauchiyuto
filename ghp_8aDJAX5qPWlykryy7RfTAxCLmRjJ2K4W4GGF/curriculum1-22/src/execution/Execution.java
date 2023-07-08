package execution;

import process.Process;

public class Execution {

	public static void main(String[] args) {
		// 各インスタンス作成
		Process process = new Process("日本");
		process.displayCountry ();
		Process process1 = new Process("寿司","和食");
		process1.displayFood ();
		Process process2 = new Process();
		process2.displayDate ();
	}
}
