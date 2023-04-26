package javaKadai;

import java.util.HashMap;
import java.util.Map.Entry;

public class Example1_5 {
    public static void main(String[] args) {
    	HashMap<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "りんご");
        fruitMap.put(2, "いちご");
        fruitMap.put(3, "みかん");
        fruitMap.put(4, "バナナ");
        fruitMap.put(5, "メロン");
        for(Entry<Integer, String> entry : fruitMap.entrySet()) {
        	System.out.print(entry.getKey() + " ");
        	System.out.println(entry.getValue());
        }
    }
}
