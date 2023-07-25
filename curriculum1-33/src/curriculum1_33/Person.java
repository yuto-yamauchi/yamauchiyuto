package curriculum1_33;

public class Person {
	// 回数の変数宣言
	public static int count = 0;
	// 各変数の宣言
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;
	// コンストラクタを定義
	public Person(String firstName, int age, double height, double weight) {
		Person.count++;
		// 引数を変数に代入
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// コンストラクタのオーバーロード
	public Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	// 各メソッドを定義
	public String fullName(){
		return this.firstName + this.lastName;
	}
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}
	public double bmi() {
		double bmi = Math.floor(weight / (height * height));
		return bmi;
	}
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}