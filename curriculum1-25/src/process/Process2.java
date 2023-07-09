package process;

public class Process2 extends Process{
	// コンストラクタの作成
	public Process2(String name) {
		super();
		super.setName(name);
	}
	// メソッドを作成
	public void display() {
		// コンソール出力
		System.out.println("こんにちは「" + super.getName() + "」さん");
		System.out.println("ステータス\n"
				+ "HP" + hp + "\n"
				+ "MP" + mp + "\n"
				+ "HP" + atk + "\n"
				+ "HP" + spd + "\n"
				+ "HP" + def + "\n");
		System.out.println("さあ冒険に出かけよう！");
	}
}