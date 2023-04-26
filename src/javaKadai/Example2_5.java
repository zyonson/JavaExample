package javaKadai;

public class Example2_5 {
    public static void main(String[] args) {
    	Point point = new Point(2,1,5,6);
    	point.kyori();
    }
}

class Point{
    private int x1; int x2; int y1; int y2;
    public Point(int a, int b, int c, int d) {
    x1 = a; x2 = b; y1 = c; y2 = d;
    }
	void kyori () {
	    double answer = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	    System.out.println(answer);
    }
}
