import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapT {
	
	public static void main(String[] args) {
	
		HashMap<Integer, String> map=new HashMap <Integer, String>();  
		map.put(101, "mukesh");
		map.put(102, "aditya");
		map.put(103, "shiva");
		
	Iterator<Integer> br = map.keySet().iterator(); // key set is method

	while(br.hasNext()) {
		
		int key = (int)br.next();
		
		System.out.println(key+" "+map.get(key));
		
		
		
	}

	
		
	}
}
