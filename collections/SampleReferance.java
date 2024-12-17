import java.util.*;
public class SampleReferance {
	public static void main(String[] args) {
		List l1;
		System.out.println("1. LinkedList");
		System.out.println("2. ArrayList");
		System.out.println("3. Vector");
		
		int opt=1;
		if (opt==1) {
			l1=new LinkedList();
		} else if(opt==2){
			l1=new ArrayList();
		}
		else if(opt==3){
			l1=new Vector();
		}else {
			
		}
	}
}
