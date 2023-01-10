package task4;

import java.util.Arrays;

public class secondlargest {

	public static void main(String[] args) {
	
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		
		int[] a = {2,9,5,7,4,10,8};
		System.out.println("Array before sorting" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting" +Arrays.toString(a));
		for(int i=0;i<a.length; i++)
		{
			
		
		if (a[i]>largest)
		{
			secondLargest=largest;
			largest=a[i];
			
		}
		
		else if(a[i]<secondLargest)
		{
			secondLargest=a[i];
			
		}
	
		}
		
	System.out.println("The Second largest number is: "	+secondLargest);

	}

}
