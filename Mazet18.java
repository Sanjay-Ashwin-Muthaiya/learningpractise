import java.io.*;
class Mazet18{
	
	public static void main(String[]args)throws IOException{
		File f=new File("C:/SAMS");
		boolean b=f.mkdir();
		System.out.println(b);
	    File ff=new File("C:/SAMS/Text.txt");
		
		FileWriter fw=new FileWriter(ff);
		fw.write("hi hw r u?");
		fw.close();
		
		
		
		FileReader fr=new FileReader(ff);
		char a[]=new char[10];
		fr.read(a);
		System.out.println(a);
		//fw.close();
		
		
		//File fb=new File("C:/SAMS/Text1.txt");
				FileWriter fww=new FileWriter(ff);
		BufferedWriter bw=new BufferedWriter(fww);
		bw.write("hi, Im fine");
		bw.flush();
		bw.close();
        

		
				FileReader frr=new FileReader(ff);
		BufferedReader br=new BufferedReader(frr);
		String s=br.readLine();
		System.out.println(s);
		//br.close();


}

}






/*fileWriter()-->hi hw r u?



BufferedWriter()-->hi,am fine*/