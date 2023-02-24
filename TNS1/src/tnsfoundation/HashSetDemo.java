package tnsfoundation;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Set1
HashSet<Integer> hs=new HashSet<Integer>();
hs.add(20);
hs.add(30);
hs.add(50);
hs.add(40);
hs.add(80);

System.out.println(hs);

//Set2
HashSet<Integer> hs1=new HashSet<Integer>();
hs1.add(null);
hs1.add(80);
hs1.add(20);
hs1.add(25);
hs1.add(30);
hs1.add(null);

System.out.println("Set2 is"+hs1);

hs1.addAll(hs);//combine all element
System.out.println("Resultant set is:"+hs1);

hs1.retainAll(hs);
System.out.println("Resultant set is:"+hs1);

hs1.clear();
System.out.println(hs1);


hs1.removeAll(hs);      //hs1 ke sare element delete kro it give all element of hs
System.out.println("Resultant set is:"+hs);



	}

}
