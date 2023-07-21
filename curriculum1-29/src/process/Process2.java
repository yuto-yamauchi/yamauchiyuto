package process;

public class Process2 {
	public void display(String data) {
		// 引数を分割し配列へ代入
				String[] sData = data.split(":");
				System.out.println("都道府県名：" + sData[0]);
				System.out.println("県庁所在地：" + sData[1]);
				System.out.println("面積：" + sData[2] + "km2\n");
			}
	}