package com.epam.quicksort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {

	public static void main(String ... args) {
	   final int ARRAY_SIZE = 20;
	   final int RANGE = 200;
	   int[] array = new int[ARRAY_SIZE];
	   fill(array,RANGE);
	   print(array);
	   new QuickSort(array);
	   print(array);
   }
   
   public static void print(int[] array) {
	   Arrays.stream(array).forEach(arr->System.out.print(arr+" "));
	   System.out.println("");
   }
   public static void fill(int[] array, int range) {   
	   IntStream.range(0, array.length).forEach(i->array[i]=(new Random()).nextInt(range));
   }
   
}
