import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {	
		//MAP interface uses Set & ArrayList to Store all elements of KEY and VALUE
		// it is not inherited by collection so there is no add() method in hashmap it have KEY VALUE pair
		// we can Synchronize the Object
		HashMap<Integer,String> h1=new HashMap();
		h1.put(10,"Tejas");
		h1.put(11,"Isha");
		h1.put(5,"Aditya");
		h1.put(7,"Abhishek");
		h1.put(50,"shubham");
		h1.put(65,"shubham");
		System.out.println(h1);
		
		Set s1=h1.entrySet();
		Iterator i1=s1.iterator();
		while (i1.hasNext()) {
			Map.Entry m1 = (Map.Entry) i1.next();
			System.out.println("RollNo:"+m1.getKey()+" Name: "+m1.getValue());
			
		}
		
	}
}
