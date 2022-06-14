// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int largest=a[0];
	    int secondlargest=Integer.MIN_VALUE;
	    int thirdlargest=Integer.MIN_VALUE;
	    if(n<3)
	    return -1;
	    for(int i=1;i<n;i++){
	        if(a[i]>largest){
	          thirdlargest=secondlargest;
	          secondlargest=largest;
	          largest=a[i];
	        }
	        else if(a[i]>secondlargest){
	            thirdlargest=secondlargest;
	            secondlargest=a[i];
	        }
	        else if(a[i]>thirdlargest){
	            thirdlargest=a[i];
	        }
	    }
	    return thirdlargest;
    }
}
