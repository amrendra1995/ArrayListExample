package A1;
import java.util.*;
public class ArrayComparison {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int arr1[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("enter the size of the array:");
	    int n=scn.nextInt();
	    int arr2[]=new int[n];
	    int count=0;
	    if(n==arr1.length)
	    {
	    System.out.println("enter the array elements:");
	      for(int i=0;i<n;i++)
	      {
	    	arr2[i]=scn.nextInt();
	      }
	      for(int j=0, k=0;j<n;j++,k++)
	      {
	    	if(arr1[j]==arr2[k])
	    	{
	    		count=count+1;
	    	}
	      }
	      
	    
	      if(count==n)
	      {
	    	  System.out.println("both the arrays are same");
	      }
	      
	    
	    else
	    {
	    	System.out.println("both the arrays are not same");
	    }
	      }
	    
	     else
	      {
	    	  System.out.println("both the arrays are not same");  
	      }
	    
		
	}

}
