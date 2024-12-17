import java.util.*;
class NumToArray{
    public void numtoarray(int num){
        int digits=0;
        int d;
        int temp = num;
        while (num>0) {
            d=num%10;
            digits++;
            num=num/10;
        }
        System.out.println("Total Digits = "+digits);
        num=temp;
        int a[] =new int[digits];
        while (num>0) {
            d=num%10;
            a[digits-1]=d;
            digits--;
            num=num/10;
        }
        System.out.println(Arrays.toString(a));
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();

        NumToArray na=new NumToArray();
        na.numtoarray(num);
    }
}