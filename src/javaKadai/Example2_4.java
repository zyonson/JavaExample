package javaKadai;

public class Example2_4 {
   public static void main(String[] args) {
	   Addition cal1 = new Addition(3,2);
	   System.out.println(cal1.add());
	   Subtraction cal2 = new Subtraction(4,5);
	   System.out.println(cal2.sub());
	   Multiplication cal3 = new Multiplication(2,5);
	   System.out.println(cal3.multi());
	   Division cal4 = new Division(5,5);
	   System.out.println(cal4.div());
   }
}

class Addition{
	private int num1;
	private int num2;
	public Addition(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	public int add() {
    	int sum = num1 + num2;
    	return sum;
    }
}

class Subtraction{
    private int num1;
    private int num2;
    public Subtraction(int n1, int n2) {
    	num1 = n1;
    	num2 = n2;
    }
    public int sub() {
    	int sum = num1 - num2;
        return sum;
    }
}

class Multiplication{
    private int num1;
    private int num2;
    public Multiplication(int n1, int n2) {
	    num1 = n1;
	    num2 = n2;
    }
    public int multi() {
    	int sum = num1 * num2;
    	return sum;
    }
}

class Division{
    private int num1;
    private int num2;
    public Division(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }
    public int div() {
    	int sum = num1 / num2;
    	return sum;
    }
}