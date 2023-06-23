package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		        // ローカル変数の宣言と初期化(Q1,2,3) 
		        byte byteVar = 10;
		        short shortVar = 100;
		        int intVar = 1000;
		        long longVar = 10000;
		        float floatVar = 9.5f;
		        double doubleVar = 10.5;
		        char charVar = 'a';
		        String stringVar = "ハロー";
		        boolean booleanVar = true;

		        // コンソール出力（Q4)
		        System.out.println(byteVar + shortVar + intVar + longVar);
		        System.out.println(byteVar + byteVar);
		        System.out.println(charVar + stringVar + booleanVar);
		        System.out.println(byteVar + shortVar + intVar + longVar + floatVar + doubleVar) ;
		        System.out.println(byteVar * shortVar * intVar * longVar);
		        System.out.println(doubleVar / shortVar);
		        System.out.println(byteVar - shortVar);
		        
		        // 正しく出力（Q5)
		        int num = 20;
		        int num1 = 23;
		        System.out.println("ハローJAVA" + (num + num1));

		        // 自己紹介とBMIの出力(Q6,7)
		        String name = "山田太郎";
		        int age = 18;
		        double height = 170.5;
		        double weight = 62.2;
		        String food = "寿司";
		        System.out.println("初めまして" + name + "です");
		        System.out.println("年齢は" + age + "歳です");
		        System.out.println("身長は" + height + "cmです");
		        System.out.println("体重は" + weight + "kgです");
		        System.out.println("好きな食べ物は" + food + "です");

		        double bmi = weight / ((height / 100) * (height / 100));
		        System.out.println("BMIは" +((double)Math.round(bmi*10)/10) + "です");

		        // 変数の再代入と出力(Q8)
		        name = "鈴木一郎";
		        age = 24;
		        height = 168.5;
		        weight = 64.2;
		        food = "オムライス";
		        bmi = 22.6;
		        System.out.println("初めまして" + name + "です");
		        System.out.println("年齢は" + age + "歳です");
		        System.out.println("身長は" + height + "cmです");
		        System.out.println("体重は" + weight + "kgです");
		        System.out.println("好きな食べ物は" + food + "です");
		        System.out.println("BMIは" + bmi + "です");

		        // 年齢・身長・体重の数値を和算で自己代入(Q9)
		        int age1 = age + 24;
		        double height1 = height + 168.5;
		        double weight1 = weight + 64.2; 
		        System.out.println("初めまして" + name + "です");
		        System.out.println("年齢は" + age1 + "歳です");
		        System.out.println("身長は" + height1 + "cmです");
		        System.out.println("体重は" + weight1 + "kgです");
		        System.out.println("好きな食べ物は" + food + "です");
		        double bmi1 = weight1 / ((height1 / 100) * (height1 / 100));
		        System.out.println("BMIは" +((double)Math.round(bmi1*100)/100) + "です");
		    
		        // 年齢が25歳以上ならtrueを出力(Q10)
		        boolean isAbove25 = age >= 25;
		        System.out.println(isAbove25);

		        // 年齢・身長・体重を文字列型に変換して連結して出力(Q11)
		        String age2 = "24";
		        String height2 = "168.5";
		        String weight2 = "64.2";
		        String convertedString = age2 + height2 + weight2;
		        System.out.println(convertedString);

		        // 年齢・身長を整数型に変換して出力(Q12)
		        int convertedAge = Integer.parseInt(age2);
		        int convertedHeight = (int) Double.parseDouble(height2);
		        System.out.println("年齢: " + convertedAge);
		        System.out.println("身長: " + convertedHeight);

		        // 年齢が25もしくは身長が160以上ならtrueを出力(Q13)
		        boolean isConditionMet = (convertedAge == 25 || convertedHeight >= 160);
		        System.out.println(isConditionMet);
		    }
		}
