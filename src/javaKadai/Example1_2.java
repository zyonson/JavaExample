package javaKadai;


public class Example1_2 {
    public static void main(String[] args) {
    	Integer [] arr1 = new Integer [10];
    	Integer [] arr2 = new Integer [10];
    	for(int i = 0; i < 10; i++) {
    		arr1[i] = i;
    	}
    	for(int i = 0; i < 10; i++) {
    		arr2[i] = arr1[9-i];
    		System.out.println(arr2[i]);
    	}
    }
}
