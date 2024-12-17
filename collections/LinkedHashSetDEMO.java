import java.util.*;
public class LinkedHashSetDEMO {
	public static void main(String[] args) {
		LinkedHashSet l1=new LinkedHashSet();	//	LinkedHashSet does not allow duplicate and Store all elements in order
		l1.add(123);
		l1.add(24);
		l1.add(123);
		l1.add(64);
		l1.add(56);
		l1.add(64);
		System.out.println(l1);
	}
}
