package pepparkaksFabrik;

public class Main {

	public static void main(String[] args) {
		PepparkaksFabrik pf1 = new PepparkaksFabrik();
		PepparkaksFabrik pf2 = new PepparkaksFabrik();
		pf1.baka(100);
		System.out.println("Det finns " + PepparkaksFabrik.antal + " pepparkakor i lagret");
		System.out.println("Tillverkningskostnad �r " + PepparkaksFabrik.utgift + " kr");
		System.out.println("Kassans total �r " + PepparkaksFabrik.kassaTotal + " kr" );
		
		pf1.salj(40);
		System.out.println("Vinsten f�r f�rs�ljningen av 40 pepparkakor �r " + 40 * 6 + " kr");
		System.out.println("Kassans total �r " + PepparkaksFabrik.kassaTotal + " kr");
		
		pf2.salj(70);
	
	}

}
