package curriculum1_30;

public class Person {
	// インスタンスフィールドを定義
	// 各変数を定義
	private String name;
	private int age;
	private double height;
	private double weight;
	private static int count;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){
		// 引数を変数に代入
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// カウントをインクリメント
		count++;
	}
	 // メソッドを定義
	public double bmi() {
		double bmi = Math.floor(weight / (height * height));
		return bmi;
	}
	public void print() {
		System.out.println("名前は" + this.name + "です");		
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println("年は" + this.age + "才です");
	}
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}