// Set is one built in interface
// Set does not allow to store duplicate element
// Set Do not Store Elements in order

import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet s1=new HashSet();
		s1.add(13);
		s1.add(24);
		s1.add(91);
		s1.add(13);
		s1.add(24);
		s1.add(134);
		System.out.println(s1);
		
		Iterator i1 =s1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
			
		}
	}
}
