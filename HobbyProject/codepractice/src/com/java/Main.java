import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;


public class Main {

	/**
	 * @param args
	 */
	static <X extends Number> void doubleList(List<X> list){
		//list.
	}
	
	static void doubleList11(List<? super Integer> list){
		Integer num = 12;
		list.add(num);
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		Arrays.<Number>asList(1,2,3);
		
		Map<String, String> options = new HashMap<String, String>();  
		options.put(null, "value");
		
		System.out.print("Hello "+options);
		
		BlockingQueue<String> qu = new LinkedBlockingQueue<>();
		
	}

}
