class Test{
Test(){
System.out.println("Empty Constructor");
}
Test(int i){
System.out.println("Int Constructor");
}
Test(byte b){
System.out.println("Byte Constructor");
}
Test(String s){
System.out.println("String Constructor");
}
Test(float f){
System.out.println("Float Constructor");
}
Test(char c){
System.out.println("Char Constructor");
}
Test(boolean b1){
System.out.println("Boolean Constructor");
}

static void m1(Test t){
System.out.println("m1 method");
}

void m2(){
System.out.println("m2 method");
}
static Test m3(Test x){
System.out.println("m3 method");
return x;
}
}


class Mazet11 extends Test{
Mazet11(){
System.out.println("Empty m Constructor");
}
Mazet11(int i){
	super(10);
System.out.println("Int m Constructor");
}
Mazet11(byte b){
	super((byte)2);
System.out.println("Byte m Constructor");
}
Mazet11(String s){
	super("Ashwin");
System.out.println("String m Constructor");
}
Mazet11(float f){
	super(10.0f);
System.out.println("Float m Constructor");
}
Mazet11(char c){
	super('S');
System.out.println("Char m Constructor");
}
Mazet11(boolean b1){
	super(true);
System.out.println("Boolean m Constructor");
}
static void m1(Test t){
System.out.println("Mazet11 m1 method");
}

void m2(){
	super.m2();
System.out.println("Mazet11 m2 method");
}
static Test m3(Test x){
System.out.println("Mazet11 m3 method");
return x;
}
public static void main(String[]args){
	Mazet11 ss=new Mazet11();
	new Mazet11(10);
	new Mazet11((byte)4);
	new Mazet11("Ashwin");
	new Mazet11(10.0f);
	new Mazet11('S');
	new Mazet11(true);
	m1(ss);
	ss.m2();
	m3(ss);
	Test.m1(ss);
	Test.m3(ss);
	
	
}

}