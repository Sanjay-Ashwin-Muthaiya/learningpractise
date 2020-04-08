class Super{
public void m1(){
System.out.println("m1 from super class");
}
public static void m2(){
System.out.println("m2 from super class");
}
}

class Subclass extends Super{
public void m1(){
System.out.println("m1 from subclass class");
}
public static void m2(){
System.out.println("m2 from subclass class");
}
}

class Ourclass extends Super{
public void m1(){
System.out.println("m1 from ourclass class");
}
public static void m2(){
System.out.println("m2 from ourclass class");
}
public static void main(String[] args){
	new Ourclass().m1();
	m2();
	new Subclass().m1();
	Subclass.m2();
	new Super().m1();
	Super.m2();
	
}
}