package Capge_java;
import java.util.*;

public class InputStore_array {

	public static void main(String[] args) {
		
		
		
		    Scanner s = new Scanner(System.in);
		    int[] a = new int[10];
		    int[] b = new int[10];
		    for(int i =0;i<a.length;i++){
		      System.out.println("Enter the value of a["+i+"]");
		      a[i] = s.nextInt();
		    }
		    int j = 0;
		    for(int i = b.length-1;i>=0;i--){
		      b[i] = a[j];
		      j++;
		    }
		    for(int i = 0; i< b.length; i++){
		      System.out.println("The value of b["+i+"] is "+b[i]);
		    }
		  }
		}


