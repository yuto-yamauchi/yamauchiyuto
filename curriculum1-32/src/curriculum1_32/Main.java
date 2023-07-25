package curriculum1_32;

public class Main {

	public static void main(String[] args) {
		// インスタンス生成とメソッド呼び出し
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		// コンソール出力
		System.out.println("合計" + Person.count + "です");
		// メソッド呼び出し
		Person.printCount();
	}
}