package text.kadai_015;

public class Car_Chapter15 {
	// フィールド
	private int gear = 1; // 1速から5速のギアを表す
	private int speed = 10; // ギアチェンジ後の速度を表す
	
	// コンストラクタ
	public Car_Chapter15( int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	// メソッド：ギアの値により速度を変える
	public void changeGear ( int afterGear ) {
		if ( afterGear >= 1 && afterGear <=5) {
			System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
			this.gear = afterGear;
			speed = afterGear * 10;
		} else {
			speed = 10;
		}
		
	}
	
	// ギアチェンジ後の速度を表示する
	public void run () {
		
		System.out.println("速度は時速"  + this.speed + "kmです");
	}
}
