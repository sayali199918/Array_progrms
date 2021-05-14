import java.util.*;
public class Array1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [10];
		System.out.print("Enter the Array Elements:");
		//this for loop is for input
		for(int i=0;i<=9;i++)
		{
			a[i]=sc.nextInt();
		}
		
		//Printing an array elements
		/*for(int i=0;i<=9;i++)
		{
			System.out.print(a[i]+" ");
		}
		*/
		//for each loop
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}
}
