package arrays;

public class AsciitoCharacter {
	public static void main(String args[])
	{
	int n[] = {65, 75, 85, 95,105, 115};
	  String str =null;
	for(int i:n){
	str = Character.toString((char)i);
	System.out.print(str+" ");
	        }
	}
	
}
