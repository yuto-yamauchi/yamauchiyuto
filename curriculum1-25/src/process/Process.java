package process;

import java.util.Random;

public class Process {
	// 各変数を宣言
	private String name;
	protected int hp;
	protected int mp;
	protected int atk;
	protected int spd;
	protected int def;
	// コンストラクタの作成
	public Process () {
		// インスタンスの作成
		Random rdm = new Random();
		// 1~999のランダムな値を代入
		hp = rdm.nextInt(999)+1;
		mp = rdm.nextInt(999)+1;
		atk = rdm.nextInt(999)+1;
		spd = rdm.nextInt(999)+1;
		def = rdm.nextInt(999)+1;
	}
	// セッターメソッドを作成
	public void setName(String name) {
		this.name = name;
	}
	// ゲッターメソッドを作成
	public String getName() {
		return this.name;
	}
}