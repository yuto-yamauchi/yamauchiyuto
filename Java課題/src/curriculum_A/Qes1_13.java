package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		        // ローカル変数の宣言(Q1) 
		        byte byteVar ;
		        short shortVar ;
		        int intVar ;
		        long longVar ;
		        float floatVar ;
		        double doubleVar ;
		        char charVar ;
		        String stringVar  ;
		        boolean booleanVar ;
		        
		        //　変数の初期化(Q2)
		        byteVar = 0;
		        shortVar  = 0;
		        intVar = 0;
		        longVar = 0L;
		        floatVar = 0.0f;
		        doubleVar = 0.0d;
		        charVar = '\0';
		        stringVar  = null;
		        booleanVar = false;
		        
		        // 変数に代入(Q3)		
		        byteVar = 10;
		        shortVar = 100;
		        intVar = 1000;
		        longVar = 10000l;
		        floatVar = 9.5f;
		        doubleVar = 10.5d;
		        charVar = 'a';
		        stringVar = "ハロー";
		        booleanVar = true;
		        
		        //　改行
		        System.out.println();
		        
		        // コンソール出力（Q4)
		        System.out.println(byteVar + shortVar + intVar + longVar);
		        System.out.println(byteVar + byteVar);
		        System.out.println(charVar + stringVar + booleanVar);
		        System.out.println(byteVar + shortVar + intVar + longVar + floatVar + doubleVar) ;
		        System.out.println(byteVar * shortVar * intVar * longVar);
		        System.out.println(doubleVar / shortVar);
		        System.out.println(byteVar - shortVar);

		        System.out.println();
		        
		        // 正しく出力（Q5)
		        int num = 20;
		        int num1 = 23;
		        System.out.println("ハローJAVA" + (num + num1));

		        System.out.println();

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

		        System.out.println();

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

		        System.out.println();

		        // 年齢・身長・体重の数値を和算で自己代入(Q9)
		        age += age;
		        height += height;
		        weight += weight; 
		        System.out.println("初めまして" + name + "です");
		        System.out.println("年齢は" + age + "歳です");
		        System.out.println("身長は" + height + "cmです");
		        System.out.println("体重は" + weight + "kgです");
		        System.out.println("好きな食べ物は" + food + "です");
		        double bmi1 = weight / ((height / 100) * (height / 100));
		        System.out.println("BMIは" +((double)Math.round(bmi1*100)/100) + "です");

		        System.out.println();
		    
		        // 年齢が25歳以上ならtrueを出力(Q10)
		        boolean isAbove25 = age >= 25;
		        System.out.println(isAbove25);

		        System.out.println();

		        // 年齢・身長・体重を文字列型に変換して連結して出力(Q11)
		        age = 24;
		        height = 168.5;
		        weight= 64.2;
		        String age1 = String.valueOf(age);
		        String height1 = String.valueOf(height);
		        String weight1 = String.valueOf(weight);
		        String convertedString = age1 + height1 + weight1;
		        System.out.println(convertedString);

		        System.out.println();

		        // 年齢・身長を整数型に変換して出力(Q12)
		        int convertedAge = Integer.parseInt("24");
		        int convertedHeight = (int) Double.parseDouble("168.5");
		        System.out.println("年齢: " + convertedAge);
		        System.out.println("身長: " + convertedHeight);

		        System.out.println();

		        // 年齢が25もしくは身長が160以上ならtrueを出力(Q13)
		        boolean isConditionMet = (convertedAge == 25 || convertedHeight >= 160);
		        System.out.println(isConditionMet);
		    }
		}
