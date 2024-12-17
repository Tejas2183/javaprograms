import java.util.*;
class ArrayMaxMarks{
	public static void main(String args[]){
		int a[]= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 10 Students");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<10;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("Maximum Marks = "+max);
	}
}