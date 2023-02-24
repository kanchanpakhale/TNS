package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrivorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Queue<String> pq=new PriorityQueue<String>();

//added element
pq.add("Pruthvi");
pq.add("Shreyash");
pq.add("Arti");
pq.add("Ganesh");
pq.add("Surekha");

//display element
System.out.println("Elements of the Priority Queue Are: "+pq);

//Remove Head Of The PriorityQueue(firstElement)
pq.remove();
System.out.println("After Removing "+pq);

//particular Element Remove
pq.remove("Surekha");
System.out.println("After Removing "+pq);


//poll Method
pq.poll();
System.out.println("After Poll Method "+pq);


Iterator<String>it=pq.iterator();

while(it.hasNext());
{
	System.out.println(it.next()+" ");
}

	}

}
