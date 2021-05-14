import java.util.*;
public class Largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int a[]=new int [5];
		System.out.println("Enter the elements in array:");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		 int max=a[0];
		for(int i=0;i<=4;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum value in the array is:" +max);
	}
}
		
