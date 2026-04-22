package text.kadai_028;

public class JyankenExec_Chapter28 {
	public static void main(String[] args) {
		//インスタンス生成
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		//自分のじゃんけんの手
		String myHand = jyanken.getMyChoice();
		
		//相手のじゃんけんの手
		String yourHand = jyanken.getRandom();
		
		//じゃんけん開始
		jyanken.playGame(myHand, yourHand);
	}
}
