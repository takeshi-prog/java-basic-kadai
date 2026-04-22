package text.kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう\n"
				+ "グーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		//入力チェック
		while (true) {
			//入力した内容を取得する
			String myHand = scanner.next();
			
			switch (myHand){
				case "r", "s", "p":
					System.out.println("入力：" + myHand);
					scanner.close();
					return myHand;
				default:
					System.out.println("エラーです。もう一度入力してください");
			};
		}	
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		//配列を作る
		String[] handArray = {"r", "s", "p"};
		//乱数で対戦相手のじゃんけんの手を選ぶ
		int number = (int)Math.floor(Math.random() * handArray.length);
		//対戦相手のじゃんけんの手を出力
		String yourHand = handArray[number];
		System.out.println(yourHand);
		return yourHand;
	}
	
	//じゃんけんを行う
	public void playGame(String myself, String yourself) {
		HashMap<String,String> jyankenMap = new HashMap<String,String>();
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		String my = jyankenMap.get(myself);
		String your = jyankenMap.get(yourself);
		
		System.out.println("自分の手は" + my + ",対戦相手の手は" + your);
		
		//勝敗の判定
		if (my.equals(your)) {
			System.out.println("あいこです");
		} else if (((my.equals("グー"))  && (your.equals("チョキ"))) ||
				   ((my.equals("チョキ")) && (your.equals("パー"))) ||
				   ((my.equals("パー"))  && (your.equals("グー")))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
