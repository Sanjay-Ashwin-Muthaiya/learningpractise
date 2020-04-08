  class Maze2{
static int i=20;
static byte j=2;
static byte f=2;
static int g;
static int e;
static int h=2;
static int k;
static int y;
static int c=2;


public static void add(){
System.out.println(e=i+j);

}
public static void sub(){
System.out.println(g=e-f);

}
public static void mul(){
System.out.println(k=g*h);
}
public static void div(){
System.out.println(y=c/k);
}
public static void main(String []args){
add();
sub();
mul();
div();
System.out.println(e+g+k+y);
}
}