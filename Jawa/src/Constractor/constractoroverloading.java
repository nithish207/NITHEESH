package Constractor;

public class constractoroverloading {
	String name;
	int no;
	String branch;
	public constractoroverloading(String name) {
		this.name=name;
		
	}
	public constractoroverloading(String name,int no,String branch) {
		this.name=name;
		this.no=no;
		this.branch=branch;
		
	}
		public void fdetaild()
		{
			System.out.println(name +no+branch);
		}

public static void main(String[] args) {
	constractoroverloading c=new constractoroverloading("nitheesh");
System.out.println(c.name);
constractoroverloading c1=new constractoroverloading("chintu",1425656,"mechanical");
c1.fdetaild();



}}