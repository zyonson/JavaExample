package javaKadai;

public class Example2_5 {
    public static void main(String[] args) {
    	Point point = new Point(1, 2);
    	point.kyori(3, 4);
    }
}

class Point{
    private int x; int y;
    public Point(int a, int b) {
    x = a; y = b;
    }
	void kyori (int x1, int y1) {
	    double answer = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
	    System.out.println(answer);
    }
}
