import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class CollecRem {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr= new ArrayList<String>();
		
		arr.add("hasim");
		arr.add("aditya");
		arr.add("mukesh");
		//arr.remove(0); only remove particular element
		arr.clear();
		Collections.sort(arr);
	
	//arr.removeAll(arr);
		
		
		System.out.println(arr);
		
		
		
	}

	
}
