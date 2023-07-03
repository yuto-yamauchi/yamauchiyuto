package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// 課題４を出力
		System.out.println("課題4");		
		// iとjの値が10より低い時の処理
		for(int i=1;i<10; i++) {
			for(int j=1;j<10; j++) {
				int result=i*j;
				// 式の出力
				System.out.printf("%02d*%02d=%02d",i,j,result);
				// 式の間に｜｜を入力
				if (j <= 8) {
					System.out.printf("||");
				}
				
			}
			System.out.println("");
		}

	}

}
