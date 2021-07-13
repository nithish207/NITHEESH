package basics;
//write a program for the Fibonacci series up to given number using while loop 
public class Fabinociwhile {
	  public static void main(String[] args) {
System.out.println("Fibonacci Series");
	  int i=1,firstvalue=0,secondvalue=1;
	  while(i<=10)
	  {
		  System.out.print(firstvalue +" ");
	  i++;
		  //Complete the next numbers		  }
	int nextnum=firstvalue+secondvalue;//1 1+1=2
	firstvalue=secondvalue;//1 1
	secondvalue=nextnum;//1 2
}}}


