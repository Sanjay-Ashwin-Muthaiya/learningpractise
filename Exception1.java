
import java.util.*;
class Exception1{
public static void main(String[]args){
ArrayList<String> list=new ArrayList<>();
list.add("Im");
list.add("An");
list.add("Java");
list.add("Developer");
list.add("In");
list.add("Developer");
list.add("TechMahindra");
list.add("C");
list.add("C++");
list.add("Java");
list.add("In");
list.add(3,"Sanjay Ashwin Muthaiya");
System.out.println(list);
if (list.contains("Java")){
	System.out.println("Valid");
}else{
	System.out.println("Invalid");
}

Iterator<String> iterator=list.iterator();
while (iterator.hasNext())
{
	String value=iterator.next();
	System.out.println(value);
}


}
}