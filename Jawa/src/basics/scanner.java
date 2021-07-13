package basics;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name ");
	    String name=sc.next();
	    System.out.println("enter the number ");
	    int number=sc.nextInt();
	    System.out.println("enter the percentage ");
	    float per=sc.nextFloat();
	    System.out.println("enter the double ");
	    double d=sc.nextDouble();
	    System.out.println("byte");
	    byte i=sc.nextByte();
	    System.out.println("boolean");
	    boolean bo=sc.nextBoolean();
	    System.out.println("shot");
	    short s=sc.nextShort();
	    char scs=sc.next().charAt(0);
	    System.out.println(scs);
	    System.out.println(name  +number  +per  +d +i +bo +s);
	}

}
