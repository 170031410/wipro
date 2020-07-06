package classconstructor;

public class Box {
	private double  length;
	private double breadth; 
	private double height;
	Box(double I,double b,double  h)
	{
	this.length=I;
		this.breadth=b;
		this.height=h;
	}
	public void display()
	{
		double  volume=length*breadth*height;
		System.out.println("Volume of Box is"+volume);
	}

}
