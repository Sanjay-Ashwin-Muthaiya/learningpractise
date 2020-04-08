import java.util.Scanner;
class Mazet16{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter the numeric value");
			int x=sc.nextInt();
			int y=10;
			System.out.println(x/y);
			}catch(Exception e){
				System.out.println(e);
			}finally{
				System.out.println("program done");
			}
		}
}