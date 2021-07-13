package inheritance;

class ba 
{
	String accname="nitheesh";
	int accno=623665701;
	double currbal=200;
	public void accdetailes()
	{
		System.out.println(accname+"\n"+accno+"\n"+currbal+"");
	}}
class depo extends ba{

		double deposit=150;
		double avlbal=deposit+currbal;
		public void currbal() {
			System.out.println("available balence "+currbal);
		}}
class withdr extends ba{
	 double wdw=200;
	 public void withdraw()
	 {
		 if(wdw<=currbal)
		 {
			System.out.println("collect the cash"); 
		 }
		 else
		 {
			 System.out.println("insuffcient balence");
		 }}}
public class hierarichical {

	public static void main(String[] args) {
		withdr w=new withdr();
		depo d=new depo();
	
		d.currbal();
		d.accdetailes();
		w.withdraw();
	}}
