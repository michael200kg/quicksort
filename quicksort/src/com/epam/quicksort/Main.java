package com.epam.quicksort;

public class Main {
	public static int[] array = new int[10];
	public static void main(String ... args) {
	   fill();
	   print();
	   QuickSort qs = new QuickSort(array);
	   print();
   }
   
   public static void print() {
	   for(int arr: array) {
		   System.out.print(arr+" ");
	   }
	   System.out.println("");
   }
   public static void fill() {
	   for(int i=0;i<array.length;i++) {
		   array[i]=(new Double(Math.random()*100)).intValue();
	   }
	  
   }
   
}
