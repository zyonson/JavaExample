package javaKadai;

import java.util.Arrays; 
import java.util.Collections;

public class Example1_2 {
    public static void main(String[] args) {
    	Integer [] arr1 = new Integer [10];
    	Integer [] arr2 = new Integer [10];
    	for(int i=0; i<10; i++) {
    		arr1[i] = i;
    	}
    	Arrays.sort(arr1 ,Collections.reverseOrder());
    	for(int i=0; i<10; i++) {
    		arr2[i] = arr1[i];
    	}
    }
}
