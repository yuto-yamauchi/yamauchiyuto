package curriculum1_32;

public class Person {
	// 各変数を宣言
	public String name;
	public int age;
	public double height;
	public double weight;
	public static int count;
	
	Person(String name, int age, double height, double weight){
		// 引数を変数に代入
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}
	// 各メソッドを定義
	public double bmi() {
		double bmi = Math.floor(weight / (height * height));
		return bmi;
	}
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}
