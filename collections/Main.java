import java.util.*;

public class Main { 
      public static void main(String[] args) { 
    	  int[] numbers = {1, 2, 3, 4, 5};
    	  int[] copy = Arrays.copyOf(numbers, 4);

    	  // Print both arrays
    	  System.out.println("Original array:");
    	  for (int num : numbers) {
    	      System.out.print(num + " ");
    	  }

    	  System.out.println("\nCopied array:");
    	  for (int num : copy) {
    	      System.out.print(num + " ");
    	  } 
       }
 }  