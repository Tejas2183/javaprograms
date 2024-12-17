import java.util.*;
public class ReverseNumber {
    int rev=0;
    int digit;
    public int reverse(int no){
        while (no>0) {
            digit = no%10;
            rev = (rev*10)+digit;
            no=no/10;
        }
        return rev;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int no =sc.nextInt();

        ReverseNumber rn = new ReverseNumber();
        int rev=rn.reverse(no);
        System.out.println(rev);
    }
}
