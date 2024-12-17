import java.util.*;
class ArrayMinMarks{
	void acceptMarks(){
		int marks[]= new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 10 Students");
		for(int i=0;i<10;i++){
			marks[i]=sc.nextInt();
		}
		showMinMarks(marks);
		showMaxMarks(marks);
	}
	void showMinMarks(int marks[]){
		int min=marks[0];
		for(int i=1;i<10;i++){
			if(marks[i]<min){
				min=marks[i];
			}
		}
		System.out.println("Minimum Marks = "+min);
	}

	void showMaxMarks(int marks[]){
		int max=marks[0];
		for(int i=1;i<10;i++){
			if(marks[i]>max){
				max=marks[i];
			}
		}
		System.out.println("Maximum Marks = "+max);
	}

	public static void main(String args[]){
		ArrayMinMarks a1= new ArrayMinMarks();
		a1.acceptMarks();
	}
}