package com.epam.quicksort;

import java.util.Random;

public class Main {
	public static int[] array = new int[10];
	public static void main(String ... args) {
	   fill();
	   print();
	   new QuickSort(array);
	   print();
   }
   
   public static void print() {
	   for(int arr: array) {
		   System.out.print(arr+" ");
	   }
	   System.out.println("");
   }
   public static void fill() {
	   Random rand = new Random();
	   for(int i=0;i<array.length;i++) {
		   array[i]=rand.nextInt(100);
	   }
	  
   }
   
}
