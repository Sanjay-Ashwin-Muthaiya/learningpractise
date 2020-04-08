class Mazet8 extends Maze31{
public static void m1(){

}
public static void m2(){

}
public static void m3(){
Maze31.m5();
}
public static void m4(){
new Maze32().m8();
}
public static void main(String[] args){
	Mazet8 ss=new Mazet8();
ss.m6();
m7();}
}

class Maze31 extends Maze32{
public static void m5(){
System.out.println("From m5 method");
}
public void m6(){
System.out.println("From m6 method");
}
}

class Maze32{
public static void m7(){
System.out.println("From m7 method");
}
public void m8(){
System.out.println("From m8 method");
}
}