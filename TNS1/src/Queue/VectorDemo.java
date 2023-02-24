package Queue;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vector<String> animals=new Vector<String>();
		
		//Added Element
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Lion");
		animals.add("Tiger");
		
		//Display All Element
		
		System.out.println("All The Element Are "+animals);
	//Index Position
		
		
String s=animals.get(0);
System.out.println("After Get Method " +s);


//in coloum
Iterator <String>iterate=animals.iterator();
System.out.println("Vector:");
while(iterate.hasNext())
{
	System.out.println(iterate.next());
}

//clear vector
animals.clear();
System.out.println("After Using Clear Method "+animals);
	}

}
