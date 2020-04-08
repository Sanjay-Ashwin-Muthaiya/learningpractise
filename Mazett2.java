class Mazet2{
public static  Mazet2  m1(){
	
	System.out.println("m1 method");
	return new Mazet2();
}
public void m2(){
	System.out.println("m2 method");
	
}
public void m3(){
	System.out.println("m3 method");
	
}
public void m4(){
	System.out.println("m4 method");
	
}
public static void main(String[]args)
{
	Mazet2 m=m1();
	m.m2();
	m.m3();
	m.m4();
}

}