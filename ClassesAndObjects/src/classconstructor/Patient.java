package classconstructor;

public class Patient {
  String Name;
  double height;
  double width;
public Patient(String Name,double height,double width)
	{
	
	 this.Name=Name;
	 this.height=height;
	 this.width=width;
	
		
	}
public double BMI () {
	return ( width / ( height * height ) ) * 703;
}


}
