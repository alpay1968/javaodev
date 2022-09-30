package ödev1;

public class SesliHarfler {
	public static void main(String[] args) {

		char harf = 'A';

		char[] kalın = new char[] { 'A', 'I', 'O', 'U' };
		char[] ince = new char[] { 'E', 'İ', 'Ö', 'Ü' };
		for (char letter : kalın) {
			if(letter == harf)
			System.out.println(harf + " kalın bir sesli harftir");
			
		}
		for (char letter : ince) {
			if (letter == harf)
			System.out.println(harf + " ince bir sesli harftir");
		}
		
	
		
		
		
	/*	
		
		char harf='E';
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
			default:
				System.out.println("İnce sesli harf");
		}
		
		
		*/
		
		
		
		
		
	}
}
