package javaKadai;

public class Example2_2 {
    public static void main(String[] args) {
    	System.out.println(addition(1,2));
    	System.out.println(subtraction(1,1));
    	System.out.println(multiplication(2,5));
    	System.out.println(division(10,2));
    }
    public static int addition(int num1, int num2) {
    	int sum = num1 + num2;
    	return sum;
    }
    public static int subtraction(int num1, int num2) {
    	int sum = num1 - num2;
    	return sum;
    }
    public static int multiplication(int num1, int num2) {
    	int sum = num1 * num2;
    	return sum;
    }
    public static int division(int num1, int num2) {
    	int sum = num1 / num2;
    	return sum;
    }
}
