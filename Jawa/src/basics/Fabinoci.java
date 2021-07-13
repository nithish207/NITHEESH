package basics;
//2. write a program for the Fibonacci series up to given number using for loop 


public class Fabinoci {
		  public static void main(String[] args) {
System.out.println("Fibonacci Series");
		  int firstvalue=0,secondvalue=1;
		  for(int i=1;i<=10;++i)
		  {
			  System.out.print(firstvalue +" ");
			  //Complete the next numbers		  }
		int nextnum=firstvalue+secondvalue;//1 1+1=2
		firstvalue=secondvalue;//1 1
		secondvalue=nextnum;//1 2
}}}
