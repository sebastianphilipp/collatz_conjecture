
public class Collatz {
	
	public static void main(String[] args) {

		long zahl = In.readLong("Collatz Sequence: Enter a number greater than 1: ");
		int zaehler = 0;
		
		if (zahl < 2) {
			System.out.println("Error!");
			System.exit(0);
		} else {
			while (zahl != 1) {
				if (zaehler > 500) {
					System.out.println("More than 500 iterations!");
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
			System.out.print("End, there were so many iterations: " + zaehler);
			
		}
		
	}

}
