import java.util.*;
class EvenOdd{
	void EvenOdd(int num){
		if(num%2==0)
		System.out.println("even");
		else
		System.out.println("odd");
	}

	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int no=sc.nextInt();
		
		EvenOdd e1 = new EvenOdd();
		e1.EvenOdd(no);
	}
}