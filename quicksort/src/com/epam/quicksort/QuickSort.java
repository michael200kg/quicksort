package com.epam.quicksort;

public class QuickSort {
	
	int[] array;
	
	QuickSort(int[] array) {
		this.array=array;
    	if(array!=null&&array.length>1) {
    		sort(0,this.array.length-1);
    	}		
	}
	
	public void sort(int begin, int end) {
        
		if (begin >= end) {
            return;
        }
        
        int i = begin;
    	int j = end;
    	int current = i - (i - j) / 2;
    	
    	while(i<j) {
    		
    		while(i<current&&array[i]<=array[current]) {
    			i++;
    		}
    		while(j>current&&array[j]>=array[current]) {
    			j--;
    		}
    		
    		int tmp = array[j];
    		array[j]=array[i];
    		array[i]=tmp;
    		
    		if(i==current){
    			current=j;
    		}
    		else if(j==current) {
    			current=i;
    		}
    	}
    	
    	sort(begin,current);
    	sort(current+1,end);
    }
}
