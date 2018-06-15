package A1;
import java.util.*;
public class ArrayDivisibility {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size of 1st array:");
		int n1=scn.nextInt();
		
		System.out.println("enter the size of 2nd array:");
		int n2=scn.nextInt();
		if(n1==n2)
		{
			int arr1[]=new int[n1];
			System.out.println("enter the 1st array elements:");
			for(int i=0;i<n1;i++)
		      {
		    	arr1[i]=scn.nextInt();
		      }
		int arr2[]=new int[n2];
		System.out.println("enter the 2nd array elements:");
		for(int i=0;i<n2;i++)
	      {
	    	arr2[i]=scn.nextInt();
	      }
		System.out.println("divisible elements are:");
		for(int i=0,j=0;i<n1;i++,j++)
		{
			
				if(arr1[i]%arr2[j]==0)
				{
				System.out.println(arr1[i]);	
				}
			
		}
		}
		else
		{
			System.out.println("length of both the arrays must be same");
		}
	}

}
