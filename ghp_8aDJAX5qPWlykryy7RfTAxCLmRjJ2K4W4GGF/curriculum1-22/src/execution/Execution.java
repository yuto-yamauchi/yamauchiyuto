package execution;

import process.Process;

public class Execution {

	public static void main(String[] args) {
		// 各インスタンス作成
		Process name = new Process("日本");
		name.displayCountry ();
		Process food = new Process("寿司","和食");
		food.displayFood ();
		Process date = new Process();
		date.displayDate ();
	}
}
