package text.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
	
	public void search(String fruit) {
		
		if (dictionary.get(fruit) == null) {
			System.out.println(fruit + "は存在しません");
		}else {
			System.out.println(fruit + "の意味は" + dictionary.get(fruit));
		}
	
	}

}
