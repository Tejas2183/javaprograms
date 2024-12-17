import java.util.*;
public class RemoveDuplicate {
	static void removeDuplicate(int a[]) {
//		List l1=Arrays.asList(a);
		LinkedHashSet<Integer> lhs =new LinkedHashSet<Integer>();
		//lhs.addAll(l1);
		for(int i=0;i<a.length;i++) {
			lhs.add(a[i]);
		
		}
		System.out.println(lhs);
		
	}
	public static void main(String[] args) {
		int a[]= {12,23,144,1243,23,542,144,12};
		removeDuplicate(a);
	}
}
