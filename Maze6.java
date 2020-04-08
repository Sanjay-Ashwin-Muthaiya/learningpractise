class Maze6{

static int a=1;
static int b=2;
static int c=3;
static int d=4;

public static void m1(){
System.out.println(a+c);
}
public static void m1(int x){
System.out.println(x);
}
public static void m3(){
System.out.println(c+b);
}
public static void m3(int y){
System.out.println(y);
}
public static void main(String[]args){
m1();
m1(b+d);
m3();
m3(d+a);
}
}

//ac
//bd
//cb
//da