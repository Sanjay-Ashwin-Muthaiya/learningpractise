class Maze7{
public void m1(){
new Mazetest().sub();
}
public void m2(){
Mazetest.add();
}
public static void main(String[]args){
Maze7 ss=new Maze7();
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