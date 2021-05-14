import java.util.*;
public class Smallest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		System.out.println("Enter the elements in array:");
		for(int i=0;i<=4;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<=4;i++)
		{
			if(min > a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Value in the array is:" +min);
	}
}