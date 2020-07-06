package overriding;

public class Fruit {
	 String name;
	 String taste;
	 int size;
	
	public Fruit() {
		name = "Fruit name";
		taste = "Tase of the fruit";
		size = 0;
	}
	
	public void eat () {
		System.out.println(name + " tastes like " + taste);
	}
}
