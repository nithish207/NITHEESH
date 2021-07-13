package inheritance;
class ban {
	String accname="nitheesh";
	int accno=623665701;
	double avlbal=200;
	public void accdetailes()
	{
		System.out.println(accname+"\n"+accno+"\n"+avlbal+"");
	}}
	 class deposi extends ban{
		double deposit=150;
		double currbal=deposit+avlbal;
		public void currbal() {
			System.out.println("available balence "+currbal);
		}}
	 class withdraw extends deposi{
		 double wdw=200;
		 public void withdraw()
		 {
			 if(wdw<currbal)
			 {
				System.out.println("collect the cash"); 
			 }
			 else
			 {
				 System.out.println("insuffcient balence");
			 }
		 }
	 }
public class multi {
	public static void main(String[] args) {
		
	
	withdraw w1=new withdraw();
	w1.withdraw();
	w1.accdetailes();
	w1.currbal();                      
}}
