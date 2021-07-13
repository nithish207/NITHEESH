package abstractc;

abstract class sub{

	 final public static  void  eng()                    //non abstract
		{
			
		System.out.println("this is eng");
		}
		
	 final public void maths() {
		 
		 System.out.println("this is maths");
	 }
		public abstract void chemi();                      //abstract method
		public abstract void soca();                      //abstract method
		
	}	
		class  students  extends sub {
			
		public void chemi(){
			System.out.println("this is chemi");
				
			}
		public void soca() {
			
			System.out.println("this is soca");
		}
		}

				public class abstractstatic { 

		public static void main(String[] args) {
			
			students dd = new students();
			dd.maths();
			dd.chemi();
			dd.soca();
			dd.eng();
			
		}

		
	}


