package Constractor;

public class perametrized {
	String name;
	int htno;
	public perametrized(String sname,int shtno)
	{     
		name=sname;
		htno=shtno;
		
	}
	
	public static void main(String[] args) {
		perametrized p1=new perametrized("nitheesh",14510340);
		System.out.println(p1.htno);
		System.out.println(p1.name);
	
	  
	
	

}}
