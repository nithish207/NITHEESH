package arrays;

public class gretestarray {
public static void main(String[] args) {
	int num[]= {2,5,9};
	int max=num[0];
	int min=num[0];
	for(int i=0;i<num.length;i++)
	{
		if(num[i]>max)
		{
			max=num[i];
		}
	}
	System.out.println(max);
//lowest
for(int j=0;j<num.length;j++)
{
	if(num[j]<min)
	{
		min=num[j];
	}
}
System.out.println(min);




}



}
