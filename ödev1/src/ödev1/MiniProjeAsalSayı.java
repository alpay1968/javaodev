package ödev1;

public class MiniProjeAsalSayı {
	public static void main(String[] args) {
		int number = 1;
		boolean isPrime = true;
		int remainder = number % 2;

		if (number < 2) {
			System.out.println("Geçersiz sayı");
		}

		if (number == 1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			System.out.println("Sayı asaldır");

		} else {
			System.out.println("Sayı asal değildir");
		}

	}
}
