import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a ;
		int sum = 0;
		int p = 0;
		int c = 1;
		a = scanner.nextInt();

		while (a != -1) {
			p = a;

			while (a != 0 ) {
			sum += a % 10;
			a = a / 10;
				}

			a = p ;
			if (sum % 10 == 7) {
				c = c * a;
				}

			sum = 0;
			a = scanner.nextInt();
		}
		System.out.println(c);

	}

}
