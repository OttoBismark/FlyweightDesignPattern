
public class Circle implements Shape
{

	private double x, y, radius;
	private String color;
	
	public Circle(String color)
	{
		this.color = color;
	}

	public void setX(double x)
	{
		this.x= x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	
	@Override
	public void draw()
	{
		System.out.println("Circle : Draw() ->  x = " + x + " y = " + y + " color " + color + " radius " + radius);
	}

}
