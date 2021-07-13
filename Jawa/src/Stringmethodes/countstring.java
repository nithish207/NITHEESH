package Stringmethodes;

public class countstring {
	public static void main(String[] args) {
		String name="welcome nitheesh";
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ')
			count++;
				
			
		}
		System.out.println(count);
	}

}
