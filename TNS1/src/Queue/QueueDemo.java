package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Queue<Integer>q=new LinkedList<Integer>();

//add Element
for(int i=0;i<5;i++ )
{
	q.add(i);
}

//Display all Element
System.out.println("Display Element"+q);

//Remove The head (first) Element
System.out.println(q.remove());

//After Removing 
System.out.println("After Removing "+q);

//Again Remove the Head Element
System.out.println(q.remove());

//After Removing Other Element
System.out.println("After Removing "+q);

//to checked the head of queue

System.out.println("Head Of The Queue is "+q.peek());


//to checked the size of queue
int qs=q.size();

System.out.println("Size Of The Queue is " +qs);
	}

}
