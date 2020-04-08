class Mazet4{
int a=1;
int b=2;
int c=3;
int d=4;
static int f;
static int g;
static int hg;
public static Mazet4 m1(Mazet4 x){
 f=x.a+x.d;
	x.m1(f,x);
	return x;
}
public void m1(int f,Mazet4 x){
	 g=f+x.c*x.b;
	x.m3(g,f,x);
	
}
public void m3(int g, int f,Mazet4 x){
	 hg=g*f/x.d;
}
public void m4(){
	System.out.println(f);
	System.out.println(g);
	System.out.println(hg);
}
public static void main(String[]args){
	Mazet4 x=m1(new Mazet4());
	x.m4();
}

}