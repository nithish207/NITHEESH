package Hashset;
//Write a program to Converting a hashset to an array?
import java.util.HashSet;

public class hashsettoarray {
	public static void main(String[] args) {
		HashSet<String>hashset=new HashSet<String>();
		hashset.add("a");
		hashset.add("b");
		hashset.add("c");
		hashset.add("d");
		hashset.add("e");
		hashset.add("f");
		System.out.println("hashset contains "+hashset);
		String[] array=new String[hashset.size()];
	    // Converting HashSet to Array using toArray() method
       hashset.toArray(array);
       System.out.println("array contains");
       for(String aee:array)
       {
    	   System.out.println(aee);
       }
	}

}
