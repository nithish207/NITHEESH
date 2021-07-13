package methodes;
 class parent
{
	public void carcolour()
	{
		System.out.println("black");
	}
	public void carname()
	{
		System.out.println("swift");
	}
}
 class child extends parent
 {
	 public void carcolour()
	 {
		 System.out.println("red");
	 }
 }
 class wife extends parent
 {
	 public void carcolour()
	 {
		 System.out.println("blue");
		 
	 }
	 public void carname()
	 {
		 System.out.println("auddi");
	 }
 }
public class methodeoverridding {
	public static void main(String[] args) {
	child c1=new child();
	wife w1=new wife();
	parent p1=new parent();
	c1.carcolour();
	c1.carname();
	w1.carcolour();
	w1.carname();
	p1.carcolour();
	p1.carname();
	}

}
