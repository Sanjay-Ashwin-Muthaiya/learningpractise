import java.util.*;
class Mazet19{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	String age=sc.next();
	int x=Integer.parseInt(age);
	System.out.println(x+20);
	
	String total=sc.next();
	float f=Float.parseFloat(total);
	float ft=f+20;
	System.out.println(ft);
	
	double d=Double.parseDouble(total);
	double dt=d/100;
	System.out.println(dt);
	}

}




/*scanner
	name
	age
	20+age;
	string total amount=1000
	TA+20=float
	TA/100=double*/