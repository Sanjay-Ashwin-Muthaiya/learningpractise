class Mazet3.0{
static int x=20;
static int y=25;
static int g=30;
static void m1(){

System.out.prinln("From m1 method");
}
void m2(){
m1();
System.out.prinln("From m2 method");
}
Mazet3 m3(){

m2();
System.out.prinln("From m3 method");
return new Mazet3();
}
static   Mazet3 add(Mazet3 ma){
int ad=g+y;
ma.sub(ad);
return ma;
}
void sub(int ad){
int su=ad-x;
div(su);
}
static Mazet3 div(int su){
int ad=add(new Maze3());
int di=ad/su;
new Maze3t().mul(di);
return new Mazet3();
}
void mul(){
mu=di*23;
}
public static void main(String[]args){
Mazet3 x=add(new Mazet3());
x.m3();
}
}
