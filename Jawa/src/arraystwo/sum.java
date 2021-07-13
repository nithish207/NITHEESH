package arraystwo;

public class sum {
	public static void main(String[] args) {
		int sum=0;
		int a[][]= {{2,3,4},{4,5,6},{2,3,4}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println(sum);
		}
		
	}

}
