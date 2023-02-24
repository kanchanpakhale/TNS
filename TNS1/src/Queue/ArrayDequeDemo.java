package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> dq=new ArrayDeque<String>();

//Add Element
dq.add("Mumbai");
dq.add("Pune");
dq.add("Nagpur");
dq.add("Delhi");


//Add the Element To the Last
dq.offer("Kolkata");
System.out.println("After Offer Method" +dq);

//First Method 
((ArrayDeque<String>) dq).addFirst("Nashik");
System.out.println("After Using First Method "+dq);

//Last Method
 ((ArrayDeque<String>) dq).offerLast("Hydrabad");
 System.out.println("After Using Last Method "+dq);
 
 ///To get The Elements in Coloumn
 
 Iterator<String>i=dq.iterator();
 
 while(i.hasNext())
 {
	 System.out.println(i.next());
 }
 
 //poll Method
 
 System.out.println("After Poll Method   "+ dq.poll());
	
for(String item:dq)
{
	System.out.println(item);
}
}
}
