class Mazet7{
static void m1(){	
	System.out.println("from Mazet7 class m1 method");
}
protected void m2(){
	System.out.println("from Mazet7 class m2 method");
}
public void m3(){
	System.out.println("from Mazet7 class m3 method");
}
static void m4(){
	System.out.println("from Mazet7 class m4 method");
}
}

class Mazet9 extends Mazet7{
	public void m2(){
		super.m2();
	System.out.println("from Mazet9 class m2 method");
	}
	protected static void m4(){
	System.out.println("from Mazet9 class m4 method");
	}
	void m5(){
		System.out.println("from Mazet9 class m5 method");
	}
	void m5(char c){
		System.out.println("over loading 1");
	}
	void m5(float f){
		System.out.println("over loading 2");
	}
	public static void main(String[]args){
		m1();
		new Mazet7().m3();
		m4();
		Mazet7.m4();
	    Mazet9 ss=new Mazet9();
		ss.m5();
		ss.m2();
		ss.m5('S');
		ss.m5(100.0f);
		
	}
}