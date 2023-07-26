package curriculum1_31;

public class Person {
	// 各変数を宣言
	private String fastName;
	public String lastName;
	private int age;
	private double height;
	private double weight;
	private static int count;
	
	public Person(String fastName, String lastName ,int age, double height, double weight) {
		// 引数を各変数に代入
		this.fastName = fastName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}
	// 各メソッド定義
	public double bmi() {
		double bmi = Math.floor(weight / (height * height));
		return bmi;
	}
	public String fullName(){
		return this.fastName + this.lastName;
	}
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("BMIは" + this.bmi() + "です");
		System.out.println("年は" + this.age + "才です");
	}
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
	public String getName() {
		return fullName();
	}
	public void buy(Car car) {
		car.setOwner(this.getName());
		System.out.println(car.getOwner() + "が購入しました");
	}
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.getName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}