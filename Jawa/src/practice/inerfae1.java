package practice;



interface student{
	void student();
	void subjects();
	void percentage();
}
abstract class college implements student{

	@Override
	public void student() {
		// TODO Auto-generated method stub
		System.out.println("nitheesh");
	}

	
	public void subjects() {
		// TODO Auto-generated method stub
		System.out.println("maths");
	}

	
	public abstract void percentage() ;
		
		
	}
	class percentage extends college{
	@Override
	public void percentage() {
		// TODO Auto-generated method stub
		System.out.println("25%");
	}}

	public class inerfae1  {
	public static void main(String[] args) {
		percentage p1= new percentage();
		p1.percentage();
		p1.subjects();
		p1.student();
	}
}





