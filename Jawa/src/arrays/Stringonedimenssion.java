package arrays;

public class Stringonedimenssion {
	public static void main(String[] args) {
	String n[]= {"nitheesh","mohan","harika","ragotham"};
	System.out.println("array size "+n.length);
	/*for(int i=0;i<=names.length-1;i++)
	{
		System.out.println(names[i]);
	}*/
	for(String name:n)
	{
		System.out.println(name);
	}
}
}