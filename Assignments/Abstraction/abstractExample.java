package Abstraction;

abstract class GeometricShapes {
    String nameOfShape;
    
    //abstract method
    abstract double calculateArea();
    public abstract String toString();
    
    //constructor
	public GeometricShapes(String nameOfShape) {
		System.out.println("Inside the Constructor"+" of Geometric Class");
		this.nameOfShape = nameOfShape;
	}
	
    //non abstract method
	public String getNameOfShape() {
		return nameOfShape;
	}
}

class Circle extends GeometricShapes {
    double radius;
    
    //constructor
	public Circle(String nameOfShape, double radius) {
		super(nameOfShape);
		System.out.println("Inside the constructor of the Circle class.");
		this.radius = radius;
	}
	
    //implementing the method
	@Override
	double calculateArea() {
		return Math.PI * Math.pow(radius, 2) ;
	}

	@Override
	public String toString() {
		return "Name if the Shape is : " + super.nameOfShape + " and its area is "+calculateArea();
	}
}

class Square extends GeometricShapes {
	double length;
	
	//constructor
	public Square(String nameOfShape, double length) {
		super(nameOfShape);
		System.out.println("Inside the constructor of the Square class.");
		this.length = length;
	}
	
    //implementing the method
	@Override
	double calculateArea() {
		return Math.pow(length, 2) ;
	}

	@Override
	public String toString() {
		return "Name if the Shape is : " + super.nameOfShape + " and its area is "+calculateArea();
	}
}

public class abstractExample {
	 public static void main(String[] args) {
		 GeometricShapes shapeObject1 = new Circle("Circle", 6.5);
		 System.out.println(shapeObject1.toString());
		 
		 GeometricShapes shapeObject2 = new Square("Square", 4);
		 System.out.println(shapeObject2.toString());	 
	}
}



