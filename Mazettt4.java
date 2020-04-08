class Maze4{
static void m1(int e){
int a=2;
System.out.println(a+e);
}
static void m2(byte s){
System.out.println(s);
}
static void m3(int b,float f, double d){
System.out.println(b+f+d);
}
public static void main(String []args){
	byte b=2;
m1(130);
m2(b);
m3(100,10.0f,10.98d);
}
}