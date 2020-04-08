/*class Maze9{
private String username;
private int password;
public void setusername(String name){
username=name;
}
public void setpassword(int pwd){
password=pwd;
}
public String getname(){
return username;
}

public int getpassword(){
return password;
}

}

class Maze10 extends Mazet9{
	public static void main(String[] args){
		Maze9 ss=new Maze9();
		ss.setusername("sanjayashwin");
		ss.setpassword(6666);
		String x=ss.getname();
		int y=ss.getpassword();
		System.out.println(x);
		System.out.println(y);
	}
}*/

import java.util.*;
class Maze9{
	
	private String username;
	private int password;
	
	public void setusername(String name){
		username=name;
}
	public void setpassword(int pswd){
	password=pswd;
}
	public String getusername(){
		return username;
	}
	public int getpassword(){
		return password;
	}
}

class Maze10{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		Maze9 ss=new Maze9();
		System.out.println("Enter username:");
		String username=sc.next();
		System.out.println("Enter password:");
		int password=sc.nextInt();
		ss.setusername(username);
		ss.setpassword(password);
		String x=ss.getusername();
		int y=ss.getpassword();
		System.out.println(x);
		System.out.println(y);
	}
	
}