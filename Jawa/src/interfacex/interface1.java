package interfacex;

interface employee {
	void joindate();
	void dept();
	void workallocate();
}
class infosys implements employee{

	@Override
	public void joindate() {
		System.out.println("12/05/2021");
		
	}

	@Override
	public void dept() {
		System.out.println("testing");
		
	}

	@Override
	public void workallocate() {
	System.out.println("yes");
		
	}}
public class interface1{
	public static void main(String[] args) {
		infosys i1=new infosys();
		i1.dept();
		i1.joindate();
		i1.workallocate();
	}
}


