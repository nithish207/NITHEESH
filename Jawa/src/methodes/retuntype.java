package methodes;

public class retuntype {
	public int add()
	{
		int a=10,b=20;
		System.out.println(a+b);
		return a+b;
	}
	public String name()
	{
		String a="nitheesh",b="hi";
		System.out.println(b +" "+a);
		return a+b;
	}
	public boolean chi()
	{
		int a=10,b=20;
		System.out.println(a>b);
		return a>b;
	}
	public short values()
	{
		short a=10;
		System.out.println(a);
		return a;
	}
	public byte ret()
	{
		byte a=10;
		System.out.println(a);
		return a;
	}
	public float per()
	{
		float stupersentage=50.0f;
		System.out.println(stupersentage);
		return stupersentage;
	}
	public double  pper()
	{
		double pievalue=3.14d;
		System.out.println(pievalue);
		return pievalue;
	}
	public long mobile()
	{
		long mobile=8328540625l;
		System.out.println(mobile);
		return mobile;
	}
	
public static void main(String[] args) {
	retuntype re=new retuntype();
	re.add();
	re.chi();
	re.mobile();
	re.name();
	re.per();
	re.ret();
	re.values();
	re.pper();
}
}
