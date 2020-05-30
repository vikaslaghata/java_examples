import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWordInSentence {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		String input = "This this is is is done by Saket Saket";
		//char[] arr = input.toCharArray();
		//Character cc = arr[0];
        String[] split = input.split(" ");
        for(String key:split) {
        	map.computeIfAbsent(key, word->0);
    		map.computeIfPresent(key, (word,count)->count+1);
        }      
		
        System.out.println("output= "+map);       
	}

}
