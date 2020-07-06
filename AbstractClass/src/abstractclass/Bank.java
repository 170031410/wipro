package abstractclass;

public class Bank {
	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		KOTMBank kotMBank = new KOTMBank();

		System.out.println(iciciBank.getSavingInterestRate());
		System.out.println(iciciBank.getFixedInterestRate());
		System.out.println(kotMBank.getSavingInterestRate());
		System.out.println(kotMBank.getFixedInterestRate());
		
		GeneralBank gb1 = new ICICIBank();
		GeneralBank gb2 = new KOTMBank();
		
		System.out.println(gb1.getSavingInterestRate());
		System.out.println(gb1.getFixedInterestRate());
		System.out.println(gb2.getSavingInterestRate());
		System.out.println(gb2.getFixedInterestRate());
	}
}
