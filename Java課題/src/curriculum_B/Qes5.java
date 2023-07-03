package curriculum_B;

public class Qes5 {
	
	public static void main(String[] args) {
		// 課題5の出力
		System.out.println("課題5");
		// iが10より低い、jが21より低い時の処理
		for(int i=1;i<10; i++) {
			for(int j=1;j<21; j++) {
				int result=i*j;
				// 式の出力
				System.out.printf("%02d*%02d=%03d",i,j,result);
				System.out.print(" ");
				// 式の間に||を入力
				if (j <= 19) {
					System.out.printf("||");
				}	
			}
			System.out.println("");
		}
	}
}