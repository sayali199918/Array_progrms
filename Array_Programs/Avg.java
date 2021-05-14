import java.util.*;
public class Avg
{
	public static void main(String args[])
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		System.out.print("Enter the Array Elements:");
		//this for loop is for input
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//Printing an array elements
		for(int i=0;i<=4;i++)
		{
			System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		float avg=sum/4;
		System.out.println("average number is:" +avg);
		
	}
}