import java.util.*;
class ConvertArrayToNum{
	public int convert(int a[]){
		int no=0;
		for(int i=0;i<a.length;i++){
			no=no*10+a[i];
		}
		return(no);
	}


	public static void main(String args[]){
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		ConvertArrayToNum ca= new ConvertArrayToNum();
		int no=ca.convert(a);
		System.out.println("Converted Number = "+no);
	}
}