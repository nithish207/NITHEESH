package arrays;

public class onedimension {
	public static void main(String[] args) {
		int numbers[]=new int [3];
		numbers[0]=20;
		numbers[1]=30;
		numbers[2]=40;
		//int numbers[]= {20,230,40};
		// calculate the length of array
		System.out.println("array length "+ numbers.length);
		for(int num:numbers)
		{
			System.out.println(num);
		}
	}

}
