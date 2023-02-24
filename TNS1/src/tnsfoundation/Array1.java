package tnsfoundation;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,26,30,90,89,20,76,45,23,897,17,3,56,3,39,67};


//Printing Array //

System.out.println(Arrays.toString(arr));

//Sorting Array in Asscending Arrya...


Arrays.sort(arr);
System.out.println("After Sorting"+Arrays.toString(arr));

//FInding the index position

int key=897;

System.out.println("Key is at index "+Arrays.binarySearch(arr, key));


System.out.println("Key is at index "+Arrays.binarySearch(arr, 1, 16, key));


//Second Array

int arr1[]= {12,67,84,23};

System.out.println(Arrays.toString(arr1));


//Compare

if(Arrays.compare(arr, arr1)==0)
{
System.out.println("Both Are Same")	;
}
else
{
	System.out.println("both are Differnt");
}

//Copy  Array

int arr2[]=Arrays.copyOf(arr, 10);


System.out.println(Arrays.toString(arr2));

//CopyofRange

int arr3[]=(Arrays.copyOfRange(arr, 2, 5));

System.out.println("After Sorting"+Arrays.toString(arr));

System.out.println(Arrays.toString(arr3));

//fill Method'

Arrays.fill(arr3, 100);

System.out.println(Arrays.toString(arr3));

	}
	
	

}
