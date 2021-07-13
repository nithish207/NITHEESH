package interfacex;
interface a{
	void d();
	
	
}
interface b{
	void e();
	
	
}
class c implements a,b{


@Override
public void e() {
	System.out.println("ggd");
	
}

@Override
public void d() {
	System.out.println("dgd");
	

}}
public class multipleinheritance {
	
public static void main(String[] args) {
	c c1=new c();
	c1.d();
	c1.e();
}
}
