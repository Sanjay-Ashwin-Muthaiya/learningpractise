abstract class Test{
	void m1(){
	System.out.println("Abstract class m1 method");
	}
	abstract void m2();
	abstract int m3();
}

class Mazet12 extends Test{
	void m2(){
		System.out.println("from main class");
	}
	int m3(){
		System.out.println("from main class return type int");
		return 10;
	}
	public static void main(String[]args){
		Mazet12 ss=new Mazet12();
		ss.m1();
		ss.m2();
		ss.m3();
		
		
	}
	
}