package javaKadai;

public class Example3_1 {
    public static void main(String[] args) {
    	Rectangle sikaku = new Rectangle(2,3);
    	sikaku.area();
    	sikaku.perimeter();
    	Circle en = new Circle(3);
    	en.area();
    	en.perimeter();
    	Triangle sankaku = new Triangle(2);
    	sankaku.area();
    	sankaku.perimeter();
    }
}

interface Shape {
	public abstract void area();
	public abstract void perimeter();
}

class Rectangle implements Shape{
	private int height;
	private int width;
	public Rectangle(int tate, int yoko) {
		height = tate;
		width = yoko;
	}
	public void area() {
		int sum = height*width;
		System.out.println(sum);
	}
	public void perimeter() {
		int sum = height*width*2;
		System.out.println(sum);
	}
}

class Circle implements Shape{
	private int radius;
	public Circle(int hankei) {
		radius = hankei;
	}
	public void area() {
		double sum = radius*radius*Math.PI;
		System.out.println(sum);
	}
	public void perimeter() {
		double sum = 2*Math.PI*radius;
		System.out.println(sum);
	}
}

class Triangle implements Shape{
	private int width;
	
	public Triangle(int yoko) {
		width = yoko;
	}
	public void area() {
		double sum = Math.sqrt(3)*width*width/4;
		System.out.println(sum);
	}
	public void perimeter() {
		double sum = width*3;
		System.out.println(sum);
	}
}
