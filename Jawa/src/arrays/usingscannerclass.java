package arrays;

import java.util.Scanner;

public class usingscannerclass {
	public static void main(String[] args) {
	Scanner	sc= new Scanner(System.in);
	    int size;
	    System.out.println("plese enter the array  size");
	size=sc.nextInt();
	String name[]=new String[size];
	for(int i=0;i<name.length;i++)
	{
		name[i]=sc.next();
		
	}
	System.out.println("elements are");
for(int j=0;j<name.length;j++)
{
	System.out.println(name[j]);
}
}}
