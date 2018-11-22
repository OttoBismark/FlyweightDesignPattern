
public class FlyweightPatternDemo
{
	private static final String []colors = {"Red", "Blue", "Green"};
	public static void main(String[] args)
	{
		Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
		circle.setX(getRandomX());
		circle.setY(getRandomY());
		circle.setRadius(5.2);
		circle.draw();
	}

	private static String getRandomColor()
	{
		return colors[(int)Math.random()*colors.length];
	}
	
	private static double getRandomX()
	{
		return (Math.random()*10);
	}
	
	private static double getRandomY()
	{
		return (Math.random()*10);
	}
}
