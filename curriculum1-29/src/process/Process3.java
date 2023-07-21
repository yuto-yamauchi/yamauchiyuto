package process;

import java.util.Objects;
import java.util.Scanner;

public class Process3 {
	public String consoleScan() {
		// インスタンス化
	    Scanner scanner = new Scanner(System.in);
	    //コンソール値を代入
		String str = scanner.nextLine();
		while(Objects.isNull(str) || str.length() <= 0) {
			System.out.println("値を入力してください");
			str = scanner.nextLine();
		}
		scanner.close();
		return str;
	}
}