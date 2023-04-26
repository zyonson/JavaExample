package javaKadai;

public class Example2_2 {
    public static void main(String[] args) {
    	addition(1,2);
    	subtraction(1,1);
    	multiplication(2,5);
    	division(10,2);
    }
    public static void addition(int num1, int num2) {
    	int sum = num1 + num2;
    	System.out.println(sum);
    }
    public static void subtraction(int num1, int num2) {
    	int sum = num1 - num2;
    	System.out.println(sum);
    }
    public static void multiplication(int num1, int num2) {
    	int sum = num1 * num2;
    	System.out.println(sum);
    }
    public static void division(int num1, int num2) {
    	int sum = num1 / num2;
    	System.out.println(sum);
    }
}
