package Constractor;

public class constroctor {
	String name;
	String college;

	public constroctor()
	{
		name="nitheesh";
		college="hitam";
	}
	public static void main(String[] args) {
		constroctor c1=new constroctor();
	    System.out.println(c1.name);
	    System.out.println(c1.college);
	}
   
}
