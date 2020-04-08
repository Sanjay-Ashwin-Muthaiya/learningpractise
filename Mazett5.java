/*import java.util.*;
class Mazet5{
Scanner sc=new Scanner(System.in);
public int m1(){
System.out.println("Enter the value a:");
int x=sc.nextInt();
return x;
}
public int m2(){
System.out.println("Enter the value b:");
int y=sc.nextInt();
return y;
}
	
public static void main(String[]args){
	Mazet5 sam=new Mazet5();
	int x=sam.m1();
	int y=sam.m2();
	int add=x+y;
System.out.println(add);
}
}*/

/*import java.util.*;
class Mazet5{
    static int a,b;
	 static Scanner sc=new Scanner(System.in);
    public static void m1(){
       
        System.out.println("Enter value a:");
         a=sc.nextInt();

    }
    public static void m2(){
      //  Scanner sc=new Scanner(System.in);
        System.out.println("Enter value b:");
        b=sc.nextInt();
        
    }

     public static void main(String []args){
         
		
		 m1();
         m2();
		 
		 int add=a+b;
        System.out.println("The values are" + add);
		 
         
     }
}*/

import java.util.*;
class Mazet5{
	 int a,b,x,y;
	static int sub,mul,div,add;
	static Scanner sc=new Scanner(System.in);
	public static  Mazet5 m1(){
		System.out.println("Enter value a:");
		m.a=sc.nextInt();
		System.out.println("Enter value b:");
		m.b=sc.nextInt();
		add=m.a+m.b;
		System.out.println("The add value:"+add);
		return m;
		
	}
	/*public Mazet5 m2(Mazet5 m){
		sub=m.a-m.b;
		System.out.println("The sub value:"+sub);
		return m;
	
	}
	public Mazet5 m3(Mazet5 m){
		mul=a*b;
		System.out.println("The mul values:"+mul);
		return m;
		
	}
	public Mazet5 m4(int a,int b){
		div=a/b;
		System.out.println("The div values:"+m.div);
		return m;
	}*/
	public static void main(String[]args){
		Mazet5 m = new Mazet5();
		//m.m2();
		//m.m3();
		//m.m4(10,2);
		m.m1();
	}
}