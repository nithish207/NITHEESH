package abstractc;

class complete extends abstrac{
@Override
public void taste() {
	System.out.println("sweet");
}

@Override
public void coulor() {
	System.out.println("black");
	
}}

public  class completw {
	public static void main(String[] args)
	{
		
	
	complete c1=new complete();
	c1.taste();
	c1.coulor();
	
}

}