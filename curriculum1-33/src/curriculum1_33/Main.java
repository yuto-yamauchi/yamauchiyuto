package curriculum1_33;

public class Main {

	public static void main(String[] args) {
		// 各インスタンス生成とメソッドの呼び出し
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();
		Person.printCount();
	}
}