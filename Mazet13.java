/*interface A{
int a=10;
void m1();
void m2();
}
interface B{
int b=50;
void m3();
}

class Mazet13 implements A,B{
public void m1(){

}
public void m2(){

}
public void m3(){
int c=a+b;
System.out.println(c);
}
public static void main(String[]args){
System.out.println(a);
System.out.println(b);
new Mazet13().m3();
}
}*/

interface Main{
	static void m2(){
	System.out.println("Hello");
	}
}

class Mazet13 implements Main{
	public static void main(String[]args){
		Main.m2();
	}
}