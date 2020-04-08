import java.util.*;
class Mazetest{
int m1(){
	final int a=10;
	int b=20;
	int c=a+b;
	System.out.println("c= "+c);
	return c;
}
final float m2(){
	float e=10.05f;
	float d=20.05f;
	float f=e+d;
	System.out.println("f= "+f);
	return f;
}
void m3(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age:");
	int g=sc.nextInt();
	float f=m2();
	float h=f+g;
	System.out.println("h= "+h);
	m4(h);
}
void m4(float h){
	int c=m1();
	float f=m2();
	float i=c+f+h;
	System.out.println("i="+i);
}
}

class Mazet10 extends Mazetest{
int m1(){
	final int a=10;
	int b=20;
	int c=a+b;
	System.out.println("c= "+c);
	System.out.println("from Mazet10 class m1 method");
	return c;
}
void m3(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age:");
	int g=sc.nextInt();
	float f=m2();
	float h=f+g;
	System.out.println("h= "+h);
	System.out.println("from Mazet10 class m3 method");
	m4(h);
}
void m4(float h){
	int c=m1();
	float f=m2();
	float i=c+f+h;
	System.out.println("i="+i);
	System.out.println("from Mazet10 class m4 method of 1");
}
void m4(int x){
	System.out.println("from Mazet10 class m4 method of 2");
}
public static void main(String [] args){
	Mazet10 ss=new Mazet10();
	ss.m1();
	ss.m3();
	ss.m4(10.0f);
	ss.m4(10);
}
}