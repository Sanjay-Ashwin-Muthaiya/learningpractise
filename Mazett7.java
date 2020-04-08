class Mazet7{
public void m1(){
new Mazetest().sub();
}
public void m2(){
Mazetest.add();
}
public static void main(String[]args){
Mazet7 ss=new Mazet7();
Mazetest mm=new Mazetest();
ss.m1();
ss.m2();
}
}

class Mazetest{

public static void add(){
System.out.println("From add method");
}
public void sub(){
System.out.println("From sub method");
}
}