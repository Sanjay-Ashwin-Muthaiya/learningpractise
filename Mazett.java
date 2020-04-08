class Mazet{
public static void m1(Mazet x){
	System.out.println("m1 method");
	x.m2();
	x.m3();
}
public void m2(){
	System.out.println("m2 method");
	
}
public void m3(){
	System.out.println("m3 method");
}
public static void main(String[]args){
m1(new Mazet());
}
}
