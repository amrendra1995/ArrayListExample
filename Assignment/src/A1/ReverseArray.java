package A1;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=scn.nextInt();
		int arr1[]=new int[n];
		int temp;
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr1[i]=scn.nextInt();
		}
		int j=0;
		int k=n-1;
		while(j<k)
		{
			temp=arr1[j];
			arr1[j]=arr1[k];
			arr1[k]=temp;
			j++;
			k--;
		}
		System.out.println("array elementa after reversing trhe array is:");
		for(j=0;j<n;j++)
		{
			System.out.println(arr1[j]);
		}
	}

}
