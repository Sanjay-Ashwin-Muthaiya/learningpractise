import java.util.*;
class Mazet6{
	 int a,b,add;
	static int sub,mul,div;
	static Scanner sc=new Scanner(System.in);
	public static  void m1(Mazet6 m){
		System.out.println("Enter value a:");
		m.a=sc.nextInt();
		System.out.println("Enter value b:");
		m.b=sc.nextInt();
		m.add=m.a+m.b;
		System.out.println("The add value:"+m.add);
		//return m;
		
	}
	public void m2(Mazet6 m){
		sub=m.a-m.b;
		System.out.println("The sub value:"+sub);
		//return m;
	
	}
	public void m3(Mazet6 m){
		mul=m.a*m.b;
		System.out.println("The mul values:"+mul);
		//return m;
		
	}
	public void m4(int a,int b){
		div=a/b;
		System.out.println("The div values:"+div);
		//return new Mazet6();
	}
	public static void main(String[]args){
		Mazet6 m = new Mazet6();
		m.m1(m);
		m.m2(m);
		m.m3(m);
		m.m4(10,2);
		
	}
}