package ödev1;

public class LoopDemo {
	public static void main(String[] args) {
		// for
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("Döngü bitti");

		for (int i = 0; i < 11; i = i + 2) {
			System.out.println(i);
		}

		System.out.println("Döngü bitti");

		int i = 1;

		// while
		while (i < 10) {
			System.out.println(i);
			i++;

		}

		System.out.println("While döngüsü bitti");

		// do while
		int j = 1;
		do {

			System.out.println(j);
			j++;

		} while (j < 10);
		System.out.println("Do-While döngüsü bitti");

	}
}
