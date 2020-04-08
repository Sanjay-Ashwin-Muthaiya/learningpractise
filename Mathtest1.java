class Mathtest1 {
 static String a="MazenetS";
 static String b="SolutionS";

static void m1(){
	String c=a.concat(" "+b);
		System.out.println(c);
	String d=c.toUpperCase();
		System.out.println(d);
	String s=d.toLowerCase();
		System.out.println(s);
	String ss=s.replace('e','x');
	ss=ss.replace('t','y');
		System.out.println(ss);
	//c=c.setCharAt(10,'s');
	System.out.println(c);
	
}
		public static void main(String[]args){
			m1();
}
}

