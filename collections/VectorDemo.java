import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
		Vector v1=new Vector();						// you can define Generic type of vector= Vector<Integer>v1=new Vector<Integer>();
		v1.add(122);
		v1.add(23);
		v1.add(62);
//		Enumeration e1 =v1.elements() ;            //it only use for vector
//		while (e1.hasMoreElements()) {
//			System.out.println(e1.nextElement());	
//		}
		
		Iterator i1=v1.iterator();					// Iterator is used for all Collections
		while (i1.hasNext()) {						// Iterator allows you to traverse element from Start to End
			System.out.println(i1.next());
			
		}
	}
}
