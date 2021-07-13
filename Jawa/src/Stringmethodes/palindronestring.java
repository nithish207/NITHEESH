package Stringmethodes;

public class palindronestring {

	public static void main(String[] args) {
		String original, reverse = "";
 original="nitheesh";
int length=original.length();
for(int i=original.length()-1;i>=0;i--)
{
	reverse=reverse+original.charAt(i);
}
	if(original.equals(reverse))
	{
		System.out.println("enter the string palindrone");
	}
	else
	{
		System.out.println("enter the string not palindrone");
	}


	}

}
