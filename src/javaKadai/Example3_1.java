package javaKadai;

public class Example3_1 {
    public static void main(String[] args) {
    	int type = 2;
    	Shape shape = null;
    	switch (type) {
    	case 1:
    		shape = new Rectangle(2, 3);
    		break;
    		
    	case 2:
    		shape = new Circle(4);
    		break;
    		
    	case 3:
    		shape = new Triangle(3);
    		break;
    	}
    	if (shape != null) {
    		System.out.println("面積=" + shape.area() + ". 周囲長=" + shape.perimeter());
    	}
    }
}

interface Shape {
   public double area();
   public double perimeter();
}

class Rectangle implements Shape{
	private int height;
	private int width;
	public Rectangle(int tate, int yoko) {
		height = tate;
		width = yoko;
	}
	public double area() {
		int sum = height * width;
		return sum;
	}
	public double perimeter() {
		int sum = height * width * 2;
		return sum;
	}
}

class Circle implements Shape{
	private int radius;
	public Circle(int hankei) {
		radius = hankei;
	}
	public double area() {
		double sum = radius * radius * Math.PI;
		return sum;
	}
	public double perimeter() {
		double sum = 2 * Math.PI * radius;
		return sum;
	}
}

class Triangle implements Shape{
	private int width;
	
	public Triangle(int yoko) {
		width = yoko;
	}
	public double area() {
		double sum = Math.sqrt(3) * width * width / 4;
		return sum;
	}
	public double perimeter() {
		double sum = width * 3;
		return sum;
	}
}
