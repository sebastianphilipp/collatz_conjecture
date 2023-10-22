
public class Collatz {

	//Sebastian Philipp
	
	public static void main(String[] args) {

		long zahl = In.readLong("Collatz’sche Zahlenfolge: Gebe eine Zahl >1 ein: ");
		int zaehler = 0;
		
		if (zahl < 2) {
			System.out.println("Fehler");
			System.exit(0);
		} else {
			while (zahl != 1) {
				if (zaehler > 500) {
					System.out.println("Mehr als 500 Durchgänge!");
					System.exit(0);
				} else {
					if (zahl % 2 == 0) {
						zahl /= 2;
						System.out.println(zahl);
						zaehler += 1;
					} else {
						zahl *= 3;
						zahl++;
						System.out.println(zahl);
						zaehler += 1;
					}
				}
					
			}
			System.out.print("Ende, es waren so viele Durchgänge: " + zaehler);
			
		}
		
	}

}
