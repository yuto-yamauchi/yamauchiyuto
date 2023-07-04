package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	    // Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		public static void hello(String str, int num) {
	        System.out.println("Hello " + str + " " + num);
	    }
		
		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		public static void add(int num1, int num2) {
	        System.out.println(num1 * num2);
	    }
		
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
	    }
		
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		public static void add(double num1, double num2) {
	        System.out.println(num1 + num2);
	    }
		
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		public static int[] rdmNumbers(int count) {
	        Random random = new Random();
	        int[] numbers = new int[count];

	        for (int i = 0; i < count; i++) {
	            int randomNumber = random.nextInt(100) + 1;
	            numbers[i] = randomNumber;
	            System.out.println(randomNumber);
	        }
	        return numbers;
	    }
		
		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		public static double ave(int[] numbers) {
	        int sum = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	        double average = sum / numbers.length;
	        System.out.println(average);
	        return average;
	    }
		
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		public static boolean check(double average) {
	        boolean result = average >= 50;
	        System.out.println(result);
	        return result;
	    }
		
		// 作成したメソッドをここで呼び出してください
		public static void main(String[] args) {
			// Q1:メソッド呼び出し
	        hello("JavaSE", 11);
	        // Q2:メソッド呼び出し
	        add(2, 2);
	        // Q3:初期化、メソッド呼び出し
	        int[] array = {1, 2, 3, 4, 5};
	        printArray(array);
	        // Q4:メソッド呼び出し
	        add(3.14, 3.14);
	        // Q5:メソッド呼び出し
	        int[] rdmN = rdmNumbers(5);
	        // Q6:メソッド呼び出し
	        double average = ave(rdmN);
	        // Q7:メソッド呼び出し
	        check(average);
	    }
	}
