package methodes;

public class methodeoverloading {
	public int add(int i,int j)
	{
		System.out.println(i+j);
		return i;
	}
	public String add(String name,String name2) {
		System.out.println(name+name2);
		return name;
	}
	public float add(float persentage,float pesentage2)
	{
		System.out.println(persentage+pesentage2);
		return persentage;
	}
	public long add(long number) {
		
		System.out.println(number);
		return number;
		
	}
	public static void main(String[] args) {
		methodeoverloading m1=new methodeoverloading();
		m1.add(10, 4);
		m1.add("nitheesh","nithee" );
		m1.add(9000420207l);
		m1.add(55.0f, 25.0f);
	}

}
