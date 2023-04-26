package javaKadai;

public class Example2_4 {
   public static void main(String[] args) {
	   Calculation cal = new Calculation(3,2);
	   cal.addition();
	   cal.subtraction();
	   cal.multiplication();
	   cal.division();
   }
}

class Calculation{
	private int num1;
	private int num2;
	public Calculation(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	public void addition() {
    	int sum = num1 + num2;
    	System.out.println(sum);
    }
    public void subtraction() {
    	int sum = num1 - num2;
    	System.out.println(sum);
    }
    public void multiplication() {
    	int sum = num1 * num2;
    	System.out.println(sum);
    }
    public void division() {
    	int sum = num1 / num2;
    	System.out.println(sum);
    }
}