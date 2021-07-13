package inheritance;

  class bank {
	String accname="nitheesh";
	int accno=623665701;
	double avlbal=200;
	public void accdetailes()
	{
		System.out.println(accname+"\n"+accno+"\n"+avlbal+"");
	}}
	 class deposit extends bank{
		double deposit=150;
		double currbal=deposit+avlbal;
		public void currbal() {
			System.out.println("available balence "+currbal);
		}}
public class singleinheritance
{
		public static void main(String[] args) {
			deposit s1=new deposit();
			s1.accdetailes();
			s1.currbal();
		}
	}




