package curriculum1_31;

public class Main {
	public static void main(String[] args) {
		//　インスタンス生成2
		Person person1 = new Person("鈴木","太郎", 20, 1.7, 60);
		Person person2 = new Person("山田","花子", 22, 1.5, 40);
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		// 各名前のセット、コンソール出力
		car.setOwner(person1.getName());
		bicycle.setOwner(person2.getName());
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		// メソッド呼び出し
		person1.buy(car);
		person2.buy(bicycle);
	}
}