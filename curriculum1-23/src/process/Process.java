package process;

import java.util.Objects;

public class Process {
	// 各変数を宣言
	private String animal;
	private Double body;
	private int speed;
	// 各セッターメソッド、ゲッターメソッドの作成
	public void setAnimal(String animal) {
        if (Objects.isNull(animal)) {
        	 System.out.println("動物が設定されていません。");
        } else {
        	this.animal = animal;
        }
    }
	public String getAnimal() {
		return this.animal;
	}
	public void setBody(Double body) {
        if (Objects.isNull(body)) {
            System.out.println("体重が設定されていません。");
        } else {
        	 this.body = body;
        }
    }
	public Double getBody() {
		return this.body;
	}
	public void setSpeed(int speed) {
			 this.speed = speed;
	}
	public int getSpeed() {
		return this.speed;
	}
}
