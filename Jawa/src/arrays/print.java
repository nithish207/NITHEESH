package arrays;

import java.util.Scanner;

public class print {
	public static void main(String[] args) {
		Scanner sd =new Scanner(System.in);
		int size;
		size=sd.nextInt();
		int marks[]=new int[size];
		System.out.println("enter the array names");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sd.nextInt();
			
		}
		System.out.println(marks[0]);
		System.out.println(marks[marks.length-1]);
				
	}

}
