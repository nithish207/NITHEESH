package Constractor;
public class thiskey {
	String name;
	int htno;
	String college;
public thiskey(String name,int htno,String college) {
	this.name=name;
	this.htno=htno;
	this.college=college;
	
}
public void detailes() {
	System.out.println(name+"\n"+htno+"\n"+college);
}
public static void main(String[] args) {
	 thiskey name = new thiskey("hitam", 1475893, "nitheesh");
	 name.detailes();
}
}
