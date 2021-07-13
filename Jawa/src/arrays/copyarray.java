package arrays;

public class copyarray {
	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			b[i]=a[i];
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(b[k]);
		}
	}


}
