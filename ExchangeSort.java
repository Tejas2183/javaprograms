import java.util.*;
class ExchangeSort{
	public void sort(int a[]){
		int temp;
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				if(a[i] > a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public void print(int a[]){
			for(int i=0;i<10;i++){
				System.out.print(a[i]+" ");
			}
		}

	public static void main(String args[]){
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 10 Numbers");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		ExchangeSort es=new ExchangeSort();
		es.sort(a);
		es.print(a);
		
	}
}