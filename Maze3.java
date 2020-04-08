class Maze3{

//static int a=1;
//static int b=2;
//static int c=3;
//static int d=4;*/

public static void m1(int a,int c){
System.out.println(a+c);
}
public static void m1(float b,float d){
System.out.println(b+d);
}
public static void m3(int f, int g){
System.out.println(f+g);
}
public static void m3(int h, float k){
System.out.println(h+k);
}
public static void main(String[]args){
m1(1,1);
m1(2.0f,2.0f);
m3(3,3.0f);
m3(4,4.0f);
}
}