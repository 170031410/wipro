package classconstructor;

public class PatientRes {
	public static void main(String[] args) {
		Patient patient = new Patient("sony",46/4.89,55*2.56);
		
		System.out.println(patient.BMI());

	}
}
