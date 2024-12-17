import java.util.*;
class BubbleSort{
	public void sort(int a[]){
		int temp;
		for(int i=0;i<10;i++){
			for(int j=0;j<9-i;j++){
				if(a[j] > a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
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
		BubbleSort bs=new BubbleSort();
		bs.sort(a);
		bs.print(a);
	
	}
}