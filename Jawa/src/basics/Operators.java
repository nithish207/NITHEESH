package basics;
//  Write a program for each operators wise( Athematic, Relational and Logical Operators)?
public class Operators {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a*b);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
//relational operators 
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		//assign the values 
		b=a;
		System.out.println(a+b);
		//logical operators 
  int c=40,d=20;
  System.out.println("logical");
  System.out.println(c>d||d>c);
  System.out.println(c>d&&d<c);
  
		
	}

}
