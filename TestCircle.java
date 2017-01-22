public class TestCircle{
	public static void main(String[] args){
		
	Circle c1 = new Circle();
	
	System.out.println(
			+ c1.getRadius() + " and an area of: " 
			+ c1.getArea());
	System.out.println("The Circle is the color: " + c1.getColor());
	
	Circle c2 = new Circle(6.0, "blue"); 
	
	System.out.println("The Circle has a radius of: "
			+ c2.getRadius() + " and an area of: " 
			+ c2.getArea());
	System.out.println("The Circle is the color: " + c2.getColor());
	
	Circle c3 = new Circle(4.0, "yellow"); 
	
	System.out.println(c3.toString());
	}
	
}