class Mathtest{
	static String x="Mazenet Solution";
	static int y = x.length();
	public static void m1(){
	System.out.println(y);
	}
	public static void m2(){
		 double a=5;
		 double b=2;
		 double c=Math.pow(a,b);
		System.out.println(c);
	}
	public static void m3(){
		String sam="   Mazenet   ";
		sam= sam.replaceAll("\\s", "");
		System.out.println(sam);
	}
	public static void main(String[]args){
		m1();
		m2();
		m3();
	}
}