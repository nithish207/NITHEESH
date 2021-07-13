package abstractc;

abstract class  Vehicles {
	abstract public void price();
	 abstract public void noOfWheels();
	 abstract public void models();
	}
	//RoyalEnfield is abstract because it contains abstract models()
	abstract class RoyalEnfield extends Vehicles
	{ //Override
	 public void price(){
	 System.out.println("1.6 Lakhs");
	
	 }
	 //Override
	 public void noOfWheels(){
	 System.out.println("Two wheels");
	 }
	 public void models() {
		 System.out.println("Classic 350");
	 }
	}
	class EnfieldModels extends RoyalEnfield
	{ //Override
	 public void models() {
	 System.out.println("Classic 350");
	 System.out.println("Inteceptor 600");
	 System.out.println("Enfield Himalayan");
	 System.out.println("Enfield classic 500");
	 }
	}
	//User logic class
	public class classx {
	 public static void main(String[] args)
	 {
	 //Vehicles v=new Vehicles();//CTE
	 //RoyalEnfield r=new RoyalEnfield();//CTE
	 EnfieldModels r=new EnfieldModels();
	 r.noOfWheels();
	 r.price();
	 r.models();
	 }
	} 


