import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
class Mazet17{
	public static void main(String[]args)throws IOException{
		File f=new File("C:/Ramesh1/Ram1.txt");
		FileReader fr=new FileReader(f);
		//fw.write("Hello. Im handling this file from Java");
		char a[]=new char[50];
		fr.read(a);
		System.out.println(a);
		fr.close();
		
	}
	
}